package com.az.userservice.services.impl;

import com.az.userservice.models.dtos.UserDto;
import com.az.userservice.models.requests.CreateUserRequest;
import com.az.userservice.services.UserService;
import com.az.userservice.services.cuds.users.UserCreateService;
import com.az.userservice.services.searchs.UserSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserCreateService userCreateService;
    private final UserSearchService userSearchService;

    public UserServiceImpl(UserCreateService userCreateService, UserSearchService userSearchService) {
        this.userCreateService = userCreateService;
        this.userSearchService = userSearchService;
    }
    @Override
    public UserDto create(CreateUserRequest request) {
        return userCreateService.handle(request);
    }
    @Override
    public UserDto getById(UUID id) {
        return userSearchService.getById(id);
    }
    @Override
    public List<UserDto> getAll() {
        return userSearchService.getAll();
    }

}
