package com;

import com.models.AppUser;
import com.models.Role;
import com.services.AppUserService;
import com.services.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class BookCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogueApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(AppUserService userService, RoleService roleService){
//		return args -> {
//			roleService.saveRole(new Role(null,"ROLE_USER"));
//			roleService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//			userService.saveAppUser(new AppUser(null, "Jesse", "fries", "12345", new ArrayList<>(), new ArrayList<>()));
//
//			userService.addRoleToUser("fries","ROLE_ADMIN");
//			userService.addRoleToUser("fries", "ROLE_USER");
//		};
//	}
}
