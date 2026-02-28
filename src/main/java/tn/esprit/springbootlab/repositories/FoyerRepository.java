package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.foyer;

@Repository
public interface FoyerRepository extends JpaRepository<foyer, Long> {
}
