package com.coderhouse.petshop.controllers;

import com.coderhouse.petshop.dto.ErrorResponseDto;
import com.coderhouse.petshop.entities.PetEntity;
import com.coderhouse.petshop.services.PetService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

  @Autowired
  private PetService petService;

  @Operation(summary = "Obtener todas las mascotas")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "Successful operation"),
          @ApiResponse(responseCode = "400", description = "Invalid request")
  })
  @GetMapping
  public ResponseEntity<List<PetEntity>> findAll() {
    List<PetEntity> pets = petService.findAll();

    return ResponseEntity.ok(pets);
  }

  @Operation(summary = "Crear una nueva mascota")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "Successful operation"),
          @ApiResponse(responseCode = "400", description = "Invalid parameters",
            content = { @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDto.class)) }
          )
  })
  @PostMapping
  public ResponseEntity<PetEntity> create(@RequestBody PetEntity pet) {
    PetEntity newPet = petService.save(pet);

    return ResponseEntity.ok(newPet);
  }

  @PostMapping("/{userId}/adopt/{petId}")
  public ResponseEntity<PetEntity> adoptPet(@PathVariable String userId, @PathVariable String petId) throws Exception {
    PetEntity pet = petService.adoptPet(userId, petId);

    return ResponseEntity.ok(pet);
  }

}
