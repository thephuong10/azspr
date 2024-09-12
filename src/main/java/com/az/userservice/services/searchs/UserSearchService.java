package com.az.userservice.services.searchs;

import com.az.userservice.converters.UserConverter;
import com.az.userservice.models.dtos.UserDto;
import com.az.userservice.models.entities.UserEntity;
import com.az.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserSearchService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserSearchService(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }
    public UserDto getById(UUID id){
        Optional<UserEntity>optional = userRepository.findById(id);
        return optional.map(userConverter::toDto).orElse(null);
    }

    public List<UserDto>getAll(){
        return userRepository.findAll().stream().map(userConverter::toDto).toList();
    }

}
