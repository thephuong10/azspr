package com.az.userservice.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "azdb_demo_users")
public class UserEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String avatar;
    @Column(unique = true)
    private String email;
    private String password;
    @OneToOne
    @JoinColumn(name = "roleId",nullable = false)
    private RoleEntity role;
    @ManyToMany(mappedBy = "users")
    private Set<PermissionEntity>permissions;
}
