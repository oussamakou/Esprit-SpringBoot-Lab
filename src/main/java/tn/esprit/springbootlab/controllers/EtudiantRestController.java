package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.etudiant;
import tn.esprit.springbootlab.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantRestController {

    IEtudiantService etudiantService;

    // GET http://localhost:9090/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<etudiant> retrieveAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    // GET http://localhost:9090/etudiant/retrieve-etudiant/1
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public etudiant retrieveEtudiant(@PathVariable("etudiant-id") Integer idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    // POST http://localhost:9090/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public etudiant addEtudiant(@RequestBody etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    // PUT http://localhost:9090/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public etudiant updateEtudiant(@RequestBody etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    // DELETE http://localhost:9090/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Integer idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
