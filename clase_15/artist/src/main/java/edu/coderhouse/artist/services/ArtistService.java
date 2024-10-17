package edu.coderhouse.artist.services;

import edu.coderhouse.artist.entities.ArtistEntity;
import edu.coderhouse.artist.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArtistService {

  @Autowired
  private ArtistRepository artistRepository;

  public List<ArtistEntity> findAll() {
    return artistRepository.findAll();
  }

  public Optional<ArtistEntity> findById(UUID id) {
    return artistRepository.findById(id);
  }

  public ArtistEntity save(ArtistEntity artist) {
    return artistRepository.save(artist);
  }
}
