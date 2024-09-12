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
@Table(name = "azdb_demo_permissions")
public class PermissionEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String code;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "azdb_demo_users_permissions",
            joinColumns = @JoinColumn(name = "permisson_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<UserEntity>users;
}
