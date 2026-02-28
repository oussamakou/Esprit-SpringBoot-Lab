package tn.esprit.springbootlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootlab.entities.reservation;

@Repository
public interface ReservationRepository extends JpaRepository<reservation, String> {
}
