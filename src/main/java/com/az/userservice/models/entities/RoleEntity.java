package com.az.userservice.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "azdb_demo_roles")
public class RoleEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @Column(unique = true)
    private String code;
    private String description;
}
