package com.az.userservice.services;

import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.requests.CreatePermissionRequest;

import java.util.List;
import java.util.UUID;

public interface PermissionService {
    PermissionDto create(CreatePermissionRequest request);
    PermissionDto getById(UUID id);
    List<PermissionDto>getAll();
}
