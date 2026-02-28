package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.chambre;
import tn.esprit.springbootlab.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreRestController {

    private final IChambreService chambreService;

    // GET http://localhost:9090/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    // GET http://localhost:9090/chambre/retrieve-chambre/1
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public chambre retrieveChambre(@PathVariable("chambre-id") Integer idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    // POST http://localhost:9090/chambre/add-chambre
    @PostMapping("/add-chambre")
    public chambre addChambre(@RequestBody chambre c) {
        return chambreService.addChambre(c);
    }

    // PUT http://localhost:9090/chambre/update-chambre
    @PutMapping("/update-chambre")
    public chambre updateChambre(@RequestBody chambre c) {
        return chambreService.updateChambre(c);
    }

    // DELETE http://localhost:9090/chambre/remove-chambre/1
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Integer idChambre) {
        chambreService.removeChambre(idChambre);
    }
}
