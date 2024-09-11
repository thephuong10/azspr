package com.az.userservice.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    private UUID id;
    private String name;
    private String code;
    private String description;
}
