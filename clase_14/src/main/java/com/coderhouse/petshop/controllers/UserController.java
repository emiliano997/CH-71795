package com.coderhouse.petshop.controllers;

import com.coderhouse.petshop.entities.UserEntity;
import com.coderhouse.petshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<List<UserEntity>> findAll() {
    List<UserEntity> users = userService.findAll();

    return ResponseEntity.ok(users);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<UserEntity>> findById(@PathVariable String id) {
    Optional<UserEntity> user = userService.findById(id);

    if(user.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(user);
  }

  @PostMapping
  public ResponseEntity<UserEntity> create(@RequestBody UserEntity user) {
    UserEntity newUser = userService.create(user);

    return ResponseEntity.ok(newUser);
  }
}
