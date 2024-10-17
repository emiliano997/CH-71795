package edu.coderhouse.song.services;

import edu.coderhouse.song.entities.SongEntity;
import edu.coderhouse.song.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SongService {

  @Autowired
  private SongRepository songRepository;

  public List<SongEntity> findAll() {
    return songRepository.findAll();
  }

  public Optional<SongEntity> findById(UUID id) {
    return songRepository.findById(id);
  }

  public List<SongEntity> findByArtistId(UUID artistId) {
    return songRepository.findByArtistId(artistId);
  }

  public SongEntity save(SongEntity song) {
    return songRepository.save(song);
  }
}
