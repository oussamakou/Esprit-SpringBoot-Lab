package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.universite;

@Repository
public interface UniversiteRepository extends JpaRepository<universite, Integer> {
}
