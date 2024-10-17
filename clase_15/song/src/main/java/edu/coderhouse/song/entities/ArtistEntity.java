package edu.coderhouse.song.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtistEntity {
  private UUID id;

  private String name;

  private String country;

  private int age;
}
