package com.services;

import com.models.AppUser;
import com.models.Role;

import java.util.List;

public interface AppUserService {

    AppUser saveAppUser(AppUser appUser);
    void addRoleToUser(String username, String roleName);
    AppUser getAppUser(String username);
    AppUser getAppUserByName(String name);
    List<AppUser> getUsers();
    boolean ifUserExists(AppUser appUser);
}
