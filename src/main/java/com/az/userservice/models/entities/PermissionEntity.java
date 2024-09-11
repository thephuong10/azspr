package com.az.userservice.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class PermissionEntity {
    private UUID id;
    private String code;
    private String description;
}
