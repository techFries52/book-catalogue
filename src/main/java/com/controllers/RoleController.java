package com.controllers;

import com.models.Role;
import com.services.AppUserService;
import com.services.RoleService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @RequiredArgsConstructor @Slf4j
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;
    private final AppUserService appUserService;

    @PostMapping("/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        log.info("saving new Role");
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/role/save").toUriString());
        return ResponseEntity.created(uri).body(roleService.saveRole(role));
    }

    @PostMapping("/addRoleToUser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form){
        appUserService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
