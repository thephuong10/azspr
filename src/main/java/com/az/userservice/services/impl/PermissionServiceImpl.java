package com.az.userservice.services.impl;

import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.requests.CreatePermissionRequest;
import com.az.userservice.services.PermissionService;
import com.az.userservice.services.cuds.permissions.PermissionCreateService;
import com.az.userservice.services.searchs.PermissionSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PermissionServiceImpl implements PermissionService {

    private final PermissionCreateService permissionCreateService;

    private final PermissionSearchService permissionSearchService;

    public PermissionServiceImpl(PermissionCreateService permissionCreateService, PermissionSearchService permissionSearchService) {
        this.permissionCreateService = permissionCreateService;
        this.permissionSearchService = permissionSearchService;
    }

    @Override
    public PermissionDto create(CreatePermissionRequest request) {
        return permissionCreateService.handle(request);
    }

    @Override
    public PermissionDto getById(UUID id) {
        return permissionSearchService.getById(id);
    }

    @Override
    public List<PermissionDto> getAll() {
        return permissionSearchService.getAll();
    }
}
