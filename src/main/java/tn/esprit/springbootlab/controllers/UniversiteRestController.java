package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.universite;
import tn.esprit.springbootlab.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteRestController {

    private final IUniversiteService universiteService;

    // GET http://localhost:9090/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    // GET http://localhost:9090/universite/retrieve-universite/1
    @GetMapping("/retrieve-universite/{universite-id}")
    public universite retrieveUniversite(@PathVariable("universite-id") Integer idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    // POST http://localhost:9090/universite/add-universite
    @PostMapping("/add-universite")
    public universite addUniversite(@RequestBody universite u) {
        return universiteService.addUniversite(u);
    }

    // PUT http://localhost:9090/universite/update-universite
    @PutMapping("/update-universite")
    public universite updateUniversite(@RequestBody universite u) {
        return universiteService.updateUniversite(u);
    }

    // DELETE http://localhost:9090/universite/remove-universite/1
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Integer idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }
}
