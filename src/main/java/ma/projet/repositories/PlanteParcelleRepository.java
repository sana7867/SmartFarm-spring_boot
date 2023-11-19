package ma.projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import ma.projet.entities.PlanteParcelle;

@Repository
public interface PlanteParcelleRepository extends JpaRepository<PlanteParcelle, Long>{

}
