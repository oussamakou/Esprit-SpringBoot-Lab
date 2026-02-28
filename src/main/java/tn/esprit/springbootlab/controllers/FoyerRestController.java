package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.foyer;
import tn.esprit.springbootlab.services.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerRestController {

    IFoyerService foyerService;

    // GET http://localhost:9090/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<foyer> retrieveAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    // GET http://localhost:9090/foyer/retrieve-foyer/1
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public foyer retrieveFoyer(@PathVariable("foyer-id") Long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    // POST http://localhost:9090/foyer/add-foyer
    @PostMapping("/add-foyer")
    public foyer addFoyer(@RequestBody foyer f) {
        return foyerService.addFoyer(f);
    }

    // PUT http://localhost:9090/foyer/update-foyer
    @PutMapping("/update-foyer")
    public foyer updateFoyer(@RequestBody foyer f) {
        return foyerService.updateFoyer(f);
    }

    // DELETE http://localhost:9090/foyer/remove-foyer/1
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }
}
