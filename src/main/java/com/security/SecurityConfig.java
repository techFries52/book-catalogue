package com.security;

import com.exceptions.CustomAccessDeniedHandler;
import com.filters.CustomAuthenticationFilter;
import com.filters.CustomAuthorizationFilter;
import com.util.TokenWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration @EnableWebSecurity @RequiredArgsConstructor
//@RequiredArgsConstructor
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    private final TokenWriter tokenWriter;
    private final CustomAccessDeniedHandler accessDeniedHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    }

//    public SecurityConfig(){
//        super(true);
//    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CustomAuthenticationFilter customAuthenticationFilter = new CustomAuthenticationFilter(authenticationManagerBean(), tokenWriter);
        customAuthenticationFilter.setFilterProcessesUrl("/api/login");

        http.cors().configurationSource(request -> {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200","http://localhost:3000"));
            configuration.setAllowedMethods(Arrays.asList("GET","POST"));
            configuration.setAllowedHeaders(Arrays.asList("*","list"));
            configuration.setAllowCredentials(true);
            return configuration;
        });

        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(STATELESS);

        http.authorizeRequests()
                .antMatchers("/api/login/**", "/users/token/refresh/**", "/book/**")
                .permitAll();

        http.authorizeRequests()
                .antMatchers(GET, "/users/**")
                .hasAnyAuthority("ROLE_USER")
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler);

        http.authorizeRequests()
                .antMatchers(POST, "/book/save/**")
                .hasAnyAuthority("ROLE_USER")
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler);

        http.authorizeRequests()
                .antMatchers(POST, "/users/save")
                .hasAnyAuthority("ROLE_ADMIN")
                .and()
                .exceptionHandling()
                .accessDeniedHandler(accessDeniedHandler);;

        http.authorizeRequests()
                .anyRequest()
                .authenticated();

        http.addFilter(customAuthenticationFilter);
        http.addFilterBefore(new CustomAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);

    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public static PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
