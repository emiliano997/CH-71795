package edu.coderhouse.main.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SongEntity {

  private UUID id;

  private String title;

  private Integer duration;

  private String album;

  @JsonIgnoreProperties("artistId")
  private UUID artistId;

}
