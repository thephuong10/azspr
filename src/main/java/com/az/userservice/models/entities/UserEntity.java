package com.az.userservice.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    private UUID id;
    private String name;
    private String avatar;
    private String email;
    private String password;
    private RoleEntity role;
    private Set<PermissionEntity>permissions;
}
