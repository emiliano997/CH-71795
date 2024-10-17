package edu.coderhouse.main.controllers;

import edu.coderhouse.main.entities.ArtistEntity;
import edu.coderhouse.main.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MainController {

  @Autowired
  private MainService mainService;

  @GetMapping("/artist/{id}")
  public ResponseEntity<ArtistEntity> getArtistById(@PathVariable UUID id) {
    try {
      ArtistEntity artist = mainService.getArtistById(id);

      if (artist == null) {
        return ResponseEntity.notFound().build();
      }

      return ResponseEntity.ok(artist);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return ResponseEntity.badRequest().build();
    }
  }
}
