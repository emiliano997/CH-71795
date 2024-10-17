package edu.coderhouse.artist.repositories;

import edu.coderhouse.artist.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArtistRepository extends JpaRepository<ArtistEntity, UUID> {
}
