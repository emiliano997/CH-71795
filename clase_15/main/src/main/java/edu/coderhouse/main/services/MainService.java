package edu.coderhouse.main.services;

import edu.coderhouse.main.entities.ArtistEntity;
import edu.coderhouse.main.entities.SongEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class MainService {

  public ArtistEntity getArtistById(UUID artistId) {
    RestTemplate restTemplate = new RestTemplate();

    String url = "http://localhost:5000/api/artist/" + artistId;

    ArtistEntity artist = restTemplate.getForObject(url, ArtistEntity.class);

    if (artist == null) {
      return null;
    }

    url = "http://localhost:5100/api/songs/artist/" + artistId;

    List<SongEntity> songs = restTemplate.getForObject(url, List.class);

    artist.setSongs(songs);

    return artist;
  }
}
