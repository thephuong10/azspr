package com.az.userservice.services.searchs;

import com.az.userservice.converters.PermissionConverter;
import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.entities.PermissionEntity;
import com.az.userservice.repositories.PermissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PermissionSearchService {
    private final PermissionRepository permissionRepository;
    private final PermissionConverter permissionConverter;

    public PermissionSearchService(PermissionRepository permissionRepository, PermissionConverter permissionConverter) {
        this.permissionRepository = permissionRepository;
        this.permissionConverter = permissionConverter;
    }

    public PermissionDto getById(UUID id) {
        Optional<PermissionEntity> optional = permissionRepository.findById(id);
        return optional.map(permissionConverter::toDto).orElse(null);
    }

    public List<PermissionDto> getAll(){
        return permissionRepository.findAll().stream().map(permissionConverter::toDto).toList();
    }

}
