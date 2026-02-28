package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.reservation;
import tn.esprit.springbootlab.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationRestController {

    IReservationService reservationService;

    // GET http://localhost:9090/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    // GET http://localhost:9090/reservation/retrieve-reservation/{id}
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public reservation retrieveReservation(@PathVariable("reservation-id") String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    // POST http://localhost:9090/reservation/add-reservation
    @PostMapping("/add-reservation")
    public reservation addReservation(@RequestBody reservation r) {
        return reservationService.addReservation(r);
    }

    // PUT http://localhost:9090/reservation/update-reservation
    @PutMapping("/update-reservation")
    public reservation updateReservation(@RequestBody reservation r) {
        return reservationService.updateReservation(r);
    }

    // DELETE http://localhost:9090/reservation/remove-reservation/{id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String idReservation) {
        reservationService.removeReservation(idReservation);
    }
}
