package com.az.userservice.converters;

import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.entities.RoleEntity;
import com.az.userservice.models.requests.CreateRoleRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleConverter {
    RoleEntity toEntity(CreateRoleRequest request);
    RoleDto toDto(RoleEntity entity);
}
