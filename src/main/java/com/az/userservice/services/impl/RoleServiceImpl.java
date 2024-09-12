package com.az.userservice.services.impl;

import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.requests.CreateRoleRequest;
import com.az.userservice.services.RoleService;
import com.az.userservice.services.cuds.roles.RoleCreateService;
import com.az.userservice.services.searchs.RoleSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleCreateService roleCreateService;
    private final RoleSearchService roleSearchService;

    public RoleServiceImpl(RoleCreateService roleCreateService, RoleSearchService roleSearchService) {
        this.roleCreateService = roleCreateService;
        this.roleSearchService = roleSearchService;
    }
    @Override
    public RoleDto create(CreateRoleRequest request) {
        return roleCreateService.handle(request);
    }

    @Override
    public RoleDto getById(UUID id) {
        return roleSearchService.getById(id);
    }

    @Override
    public List<RoleDto> getAll() {
        return roleSearchService.getAll();
    }
}
