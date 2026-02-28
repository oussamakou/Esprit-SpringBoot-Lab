package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.bloc;

@Repository
public interface BlocRepository extends JpaRepository<bloc, Long> {
}
