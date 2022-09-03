package com.services;

import com.models.AppUser;
import com.models.Role;

import java.util.List;

public interface AppUserService {

    AppUser saveAppUser(AppUser appUser);
    Role saveRole (Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getAppUser(String username);
    AppUser getAppUserByUserName(String name);
    List<AppUser> getUsers();
}
