package com.coderhouse.petshop.services;

import com.coderhouse.petshop.entities.UserEntity;
import com.coderhouse.petshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<UserEntity> findAll() {
    return userRepository.findAll();
  }

  public Optional<UserEntity> findById(String id) {
    return userRepository.findById(id);
  }

  public UserEntity create(UserEntity user) {
    return userRepository.save(user);
  }
}
