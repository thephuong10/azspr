package com.az.userservice.services;

import com.az.userservice.models.dtos.UserDto;
import com.az.userservice.models.requests.CreateUserRequest;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserDto create(CreateUserRequest request);
    UserDto getById(UUID id);

    List<UserDto>getAll();

}
