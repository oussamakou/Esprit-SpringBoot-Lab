package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.etudiant;

import java.util.List;

public interface IEtudiantService {
    List<etudiant> retrieveAllEtudiants();
    etudiant retrieveEtudiant(Integer idEtudiant);
    etudiant addEtudiant(etudiant e);
    etudiant updateEtudiant(etudiant e);
    void removeEtudiant(Integer idEtudiant);
}
