package edu.coderhouse.song.controllers;

import edu.coderhouse.song.entities.ArtistEntity;
import edu.coderhouse.song.entities.SongEntity;
import edu.coderhouse.song.services.SongService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/songs")
public class SongController {

  @Autowired
  private SongService songService;

  @GetMapping
  public ResponseEntity<List<SongEntity>> findAll() {
    List<SongEntity> songs = songService.findAll();

    return ResponseEntity.ok(songs);
  }

  @GetMapping("/artist/{artistId}")
  public ResponseEntity<List<SongEntity>> findByArtistId(@PathVariable UUID artistId) {
    List<SongEntity> songs = songService.findByArtistId(artistId);

    return ResponseEntity.ok(songs);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<SongEntity>> findById(@PathVariable UUID id) {
    Optional<SongEntity> song = songService.findById(id);

    if (song.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(song);
  }

  @PostMapping
  public ResponseEntity<SongEntity> save(@RequestBody SongEntity song) {
    try {
      RestTemplate restTemplate = new RestTemplate();

      String url = "http://localhost:5000/api/artist/" + song.getArtistId();

      ArtistEntity artist = restTemplate.getForObject(url, ArtistEntity.class);

      if (artist == null) {
        return ResponseEntity.notFound().build();
      }

      song.setArtistId(artist.getId());

      SongEntity newSong = songService.save(song);

      return ResponseEntity.ok(newSong);
    } catch (Exception e) {
      return ResponseEntity.badRequest().build();
    }
  }
}
