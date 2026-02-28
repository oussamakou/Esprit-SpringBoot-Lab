package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<etudiant, Integer> {
}
