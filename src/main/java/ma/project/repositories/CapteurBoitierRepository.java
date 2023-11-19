package ma.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.Entities.CapteurBoitier;

@Repository
public interface CapteurBoitierRepository extends JpaRepository<CapteurBoitier, Long> {

}
