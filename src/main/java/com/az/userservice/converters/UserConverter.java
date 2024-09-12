package com.az.userservice.converters;

import com.az.userservice.models.dtos.UserDto;
import com.az.userservice.models.entities.UserEntity;
import com.az.userservice.models.requests.CreateUserRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserConverter {
    UserEntity toEntity(CreateUserRequest request);

    UserDto toDto(UserEntity entity);


}
