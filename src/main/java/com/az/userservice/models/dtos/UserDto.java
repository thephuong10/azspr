package com.az.userservice.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private UUID id;
    private String name;
    private String avatar;
    private String email;
    private RoleDto role;
    private Set<PermissionDto>permissions;
}
