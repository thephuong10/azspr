package com.az.userservice.controllers;

import com.az.userservice.models.dtos.PermissionDto;
import com.az.userservice.models.dtos.RoleDto;
import com.az.userservice.models.requests.CreatePermissionRequest;
import com.az.userservice.models.requests.CreateRoleRequest;
import com.az.userservice.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-service/v1/permission")
public class PermissionController {
    private final PermissionService permissionService;

    @Autowired
    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<PermissionDto> getById(@PathVariable UUID id){
        return ResponseEntity.ok(permissionService.getById(id));
    }

    @GetMapping
    public ResponseEntity<List<PermissionDto>>getAll(){
        return ResponseEntity.ok(permissionService.getAll());
    }

    @PostMapping
    public ResponseEntity<PermissionDto>create(@RequestBody CreatePermissionRequest request){
        return ResponseEntity.ok(permissionService.create(request));
    }
}
