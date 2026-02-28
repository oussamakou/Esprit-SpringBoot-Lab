package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.chambre;

@Repository
public interface ChambreRepository extends JpaRepository<chambre, Integer> {
}
