package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.universite;

import java.util.List;

public interface IUniversiteService {
    List<universite> retrieveAllUniversites();
    universite retrieveUniversite(Integer idUniversite);
    universite addUniversite(universite u);
    universite updateUniversite(universite u);
    void removeUniversite(Integer idUniversite);
}
