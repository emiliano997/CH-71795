package edu.coderhouse.main.services;

import edu.coderhouse.main.api.UserRestApi;
import edu.coderhouse.main.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private final UserRestApi userRestApi;

  public UserService(UserRestApi userRestApi) {
    this.userRestApi = userRestApi;
  }

  public ResponseEntity<UserEntity[]> getUsers() {
    return userRestApi.getUsers();
  }

  public UserEntity getUserById(int id) {
    return userRestApi.getUserById(id);
  }

  public UserEntity saveUser(UserEntity user) {
    return userRestApi.saveUser(user);
  }

  public UserEntity updateUser(int id, UserEntity user) {
    return userRestApi.updateUser(id, user);
  }

  public UserEntity deleteUser(int id) {
    return userRestApi.deleteUser(id);
  }
}
