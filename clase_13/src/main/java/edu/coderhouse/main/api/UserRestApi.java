package edu.coderhouse.main.api;

import edu.coderhouse.main.entities.UserEntity;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRestApi {

  final String uri = "https://jsonplaceholder.typicode.com/users";

  public UserRestApi() {}

  public ResponseEntity<UserEntity[]> getUsers() {
    RestTemplate restTemplate = new RestTemplate();

    // ResponseEntity<UserEntity[]> response = restTemplate.exchange(
    //         this.uri,
    //        HttpMethod.GET,
    //        null,
    //        UserEntity[].class
    // );

    return restTemplate.getForEntity(this.uri, UserEntity[].class);
  }

  public UserEntity getUserById(int id) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = new HashMap<String, String>();

    params.put("id", String.valueOf(id));

    return restTemplate.getForObject(this.uri + "/{id}", UserEntity.class, params);
    // return restTemplate.getForEntity(this.uri + "/{id}", UserEntity.class, id);
  }

  public UserEntity saveUser(UserEntity user) {
    RestTemplate restTemplate = new RestTemplate();


    return restTemplate.postForObject(
            this.uri,
            user,
            UserEntity.class
    );
  }

  public UserEntity updateUser(int id, UserEntity user) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = new HashMap<String, String>();

    params.put("id", String.valueOf(id));

    restTemplate.put(
            this.uri + "/{id}",
            user,
            params
    );

    return user;
  }

  public UserEntity deleteUser(int id) {
    RestTemplate restTemplate = new RestTemplate();

    Map<String, String> params = new HashMap<String, String>();

    params.put("id", String.valueOf(id));

    UserEntity user = restTemplate.getForObject(this.uri + "/{id}", UserEntity.class, params);

    restTemplate.delete(
            this.uri + "/{id}",
            user,
            params
    );

    return user;
  }
}
