package tn.esprit.springbootlab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.universite;
import tn.esprit.springbootlab.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    UniversiteRepository universiteRepository;

    @Override
    public List<universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public universite addUniversite(universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public universite updateUniversite(universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void removeUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
