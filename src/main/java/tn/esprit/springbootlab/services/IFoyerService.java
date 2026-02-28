package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.foyer;

import java.util.List;

public interface IFoyerService {
    List<foyer> retrieveAllFoyers();
    foyer retrieveFoyer(Long idFoyer);
    foyer addFoyer(foyer f);
    foyer updateFoyer(foyer f);
    void removeFoyer(Long idFoyer);
}
