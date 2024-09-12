package com.az.userservice.models.requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateRoleRequest {
    private String name;
    private String code;
    private String description;
}
