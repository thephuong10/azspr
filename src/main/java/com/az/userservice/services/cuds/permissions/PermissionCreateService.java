package com.az.userservice.services.cuds.permissions;

import com.az.userservice.converters.PermissionConverter;
import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.requests.CreatePermissionRequest;
import com.az.userservice.repositories.PermissionRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionCreateService {
    private final PermissionRepository permissionRepository;
    private final PermissionConverter permissionConverter;

    public PermissionCreateService(PermissionRepository permissionRepository, PermissionConverter permissionConverter) {
        this.permissionRepository = permissionRepository;
        this.permissionConverter = permissionConverter;
    }

    public PermissionDto handle(CreatePermissionRequest request){
        return permissionConverter.toDto(permissionRepository.save(permissionConverter.toEntity(request)));
    }
}
