package com.az.userservice.services.cuds.users;

import com.az.userservice.converters.UserConverter;
import com.az.userservice.models.dtos.UserDto;
import com.az.userservice.models.entities.UserEntity;
import com.az.userservice.models.requests.CreateUserRequest;
import com.az.userservice.repositories.PermissionRepository;
import com.az.userservice.repositories.RoleRepository;
import com.az.userservice.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserCreateService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;
    private final UserConverter userConverter;

    public UserCreateService(UserRepository userRepository, RoleRepository roleRepository, PermissionRepository permissionRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
        this.userConverter = userConverter;
    }
    @Transactional
    public UserDto handle(CreateUserRequest request){
        UserEntity userEntity = userConverter.toEntity(request);
        userEntity.setRole(roleRepository.findById(request.getRoleId()).orElse(null));
        userEntity.setPermissions(request.getPermissionIds()
                .stream()
                .map(pId->permissionRepository.findById(pId).orElse(null))
                .filter(Objects::nonNull)
                .collect(Collectors.toSet())
        );
        return userConverter.toDto(userRepository.save(userEntity));
    }
}
