package com.az.userservice.controllers;

import com.az.userservice.models.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-service/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<List<UserDto>>getAll(){
        UserDto userDto = new UserDto();
        userDto.setId(UUID.randomUUID());
        userDto.setEmail("email123@gmail.com");
        userDto.setAvatar("avatar");
        return ResponseEntity.ok(Collections.singletonList(userDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<UserDto>>getById(@PathVariable String id){
        UserDto userDto = new UserDto();
        userDto.setId(UUID.randomUUID());
        userDto.setEmail(id.concat("email123@gmail.com"));
        userDto.setAvatar("avatar");
        return ResponseEntity.ok(Collections.singletonList(userDto));
    }


}
