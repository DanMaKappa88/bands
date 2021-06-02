package hu.flowacademy.bands.repository;

import hu.flowacademy.bands.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album,String> {

}
