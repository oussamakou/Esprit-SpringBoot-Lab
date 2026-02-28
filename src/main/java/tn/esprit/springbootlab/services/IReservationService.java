package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.reservation;

import java.util.List;

public interface IReservationService {
    List<reservation> retrieveAllReservations();
    reservation retrieveReservation(String idReservation);
    reservation addReservation(reservation r);
    reservation updateReservation(reservation r);
    void removeReservation(String idReservation);
}
