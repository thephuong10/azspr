package com.az.userservice.services.searchs;

import com.az.userservice.converters.RoleConverter;
import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.entities.RoleEntity;
import com.az.userservice.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RoleSearchService {
    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    public RoleSearchService(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }
    public RoleDto getById(UUID id) {
        Optional<RoleEntity> optional = roleRepository.findById(id);
        return optional.map(roleConverter::toDto).orElse(null);
    }

    public List<RoleDto>getAll(){
        return roleRepository.findAll().stream().map(roleConverter::toDto).toList();
    }

}
