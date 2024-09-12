package com.az.userservice.converters;

import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.entities.PermissionEntity;
import com.az.userservice.models.requests.CreatePermissionRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionConverter {
    PermissionEntity toEntity(CreatePermissionRequest request);

    PermissionDto toDto(PermissionEntity entity);
}
