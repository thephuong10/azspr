package com.az.userservice.controllers;

import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.requests.CreateRoleRequest;
import com.az.userservice.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-service/v1/role")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto>getById(@PathVariable UUID id){
        return ResponseEntity.ok(roleService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<RoleDto>>getAll(){
        return ResponseEntity.ok(roleService.getAll());
    }

    @PostMapping
    public ResponseEntity<RoleDto>create(@RequestBody CreateRoleRequest request){
        return ResponseEntity.ok(roleService.create(request));
    }

}
