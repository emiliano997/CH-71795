package edu.coderhouse.main.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
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

  private List<SongEntity> songs;
}
