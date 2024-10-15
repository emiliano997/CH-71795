package com.coderhouse.petshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "USERPETSHOP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "ID")
  @Schema(description = "User's id", requiredMode = Schema.RequiredMode.AUTO, example = "0124529f-81b7-4924-952e-8d3fe108ab8f")
  private String id;

  @Column(name = "NAME", nullable = false)
  @Schema(description = "User's name", requiredMode = Schema.RequiredMode.REQUIRED, example = "Anderson")
  private String name;

  @Column(name = "EMAIL", nullable = false, unique = true)
  @Schema(description = "User's email", requiredMode = Schema.RequiredMode.REQUIRED, example = "anderson@gmail.com")
  private String email;

  @OneToMany(mappedBy = "adoptedBy", cascade = CascadeType.ALL)
  @JsonIgnoreProperties("adoptedBy")
  private List<PetEntity> adoptedPets;
}
