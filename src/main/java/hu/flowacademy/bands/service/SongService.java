package hu.flowacademy.bands.service;

import hu.flowacademy.bands.model.Song;
import hu.flowacademy.bands.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class SongService {

    private final SongRepository songRepository;

    public List<Song> findAll() {
    }

    public Optional<Song> findOne() {
    }

    public Song save(Song song) {
    }
}
