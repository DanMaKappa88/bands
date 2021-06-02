package hu.flowacademy.bands.repository;

import hu.flowacademy.bands.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BandRepository extends JpaRepository<Band,String> {
}
