package com.az.userservice.services;

import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.requests.CreateRoleRequest;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    RoleDto create(CreateRoleRequest request);

    RoleDto getById(UUID id);

    List<RoleDto>getAll();
}
