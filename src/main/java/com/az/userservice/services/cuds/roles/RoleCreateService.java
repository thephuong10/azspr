package com.az.userservice.services.cuds.roles;

import com.az.userservice.converters.RoleConverter;
import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.requests.CreateRoleRequest;
import com.az.userservice.repositories.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class RoleCreateService {
    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    public RoleCreateService(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }

    @Transactional
    public RoleDto handle(CreateRoleRequest request){
        return roleConverter.toDto(roleRepository.save(roleConverter.toEntity(request)));
    }

}
