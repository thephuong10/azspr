package com.az.userservice.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserRequest {
    private String name;
    private String avatar;
    private String email;
    private UUID roleId;
    private Set<UUID> permissionIds;
}
