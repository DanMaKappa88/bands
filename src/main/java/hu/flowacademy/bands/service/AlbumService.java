package hu.flowacademy.bands.service;

import hu.flowacademy.bands.model.Album;
import hu.flowacademy.bands.repository.AlbumRepository;
import hu.flowacademy.bands.repository.BandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;
    private final BandRepository bandRepository;

    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    public Optional<Album> findOne(String id) {
    }

  

    public List<String> findAllAlbumsByBand(String band) {
    }

    public List<String> findOneDetailed(String id) {
    }

    public Album save(Album album) {
    }
}
