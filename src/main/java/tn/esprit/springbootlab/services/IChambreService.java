package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.chambre;

import java.util.List;

public interface IChambreService {
    List<chambre> retrieveAllChambres();
    chambre retrieveChambre(Integer idChambre);
    chambre addChambre(chambre c);
    chambre updateChambre(chambre c);
    void removeChambre(Integer idChambre);
}
