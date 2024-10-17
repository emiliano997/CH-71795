package edu.coderhouse.song.repositories;

import edu.coderhouse.song.entities.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SongRepository extends JpaRepository<SongEntity, UUID> {

  public List<SongEntity> findByArtistId(UUID artistId);
}
