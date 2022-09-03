package com.services;

import com.models.AppUser;
import com.models.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService{
    @Override
    public AppUser saveAppUser(AppUser appUser) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public AppUser getAppUser(String username) {
        return null;
    }

    @Override
    public AppUser getAppUserByUserName(String name) {
        return null;
    }

    @Override
    public List<AppUser> getUsers() {
        return null;
    }
}
