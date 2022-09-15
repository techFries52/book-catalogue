package com.services;

import com.models.Role;
import com.repos.RoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service @Slf4j
public class RoleServiceImpl implements RoleService{

    public RoleServiceImpl(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    private final RoleRepo roleRepo;

    @Override
    public Role saveRole(Role role) {
        log.info("new role: {} saved", role.getName());
        return roleRepo.save(role);
    }
}
