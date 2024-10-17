package edu.coderhouse.artist.controllers;

import edu.coderhouse.artist.entities.ArtistEntity;
import edu.coderhouse.artist.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {

  @Autowired
  private ArtistService artistService;

  @GetMapping
  public ResponseEntity<List<ArtistEntity>> findAll() {
    List<ArtistEntity> artists = artistService.findAll();

    return ResponseEntity.ok(artists);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<ArtistEntity>> findById(@PathVariable UUID id) {
    Optional<ArtistEntity> artist = artistService.findById(id);

    if(artist.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(artist);
  }

  @PostMapping
  public ResponseEntity<ArtistEntity> save(@RequestBody ArtistEntity artist) {
    ArtistEntity newArtist = artistService.save(artist);

    return ResponseEntity.ok(newArtist);
  }

}
