package com.coderhouse.petshop.services;

import com.coderhouse.petshop.entities.PetEntity;
import com.coderhouse.petshop.entities.UserEntity;
import com.coderhouse.petshop.repository.PetRepository;
import com.coderhouse.petshop.repository.UserRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

  @Autowired
  private PetRepository petRepository;

  @Autowired
  private UserRepository userRepository;

  // Create
  public PetEntity save(PetEntity pet) {
    return petRepository.save(pet);
  }

  // Get
  public List<PetEntity> findAll() {
    return petRepository.findAll();
  }

  public PetEntity adoptPet(String userId, String petId) throws Exception {
    Optional<UserEntity> userOpt = userRepository.findById(userId);
    Optional<PetEntity> petOpt = petRepository.findById(petId);

    if(userOpt.isPresent() && petOpt.isPresent()) {
      PetEntity pet = petOpt.get();

      if(!pet.isAdopted()) {
        UserEntity user = userOpt.get();

        pet.setAdoptedBy(user);
        pet.setAdopted(true);

        return petRepository.save(pet);
      } else {
        throw new BadRequestException("Pet has been adopted");
      }
    } else {
      throw new BadRequestException("Pet or user not found");
    }
  }
}
