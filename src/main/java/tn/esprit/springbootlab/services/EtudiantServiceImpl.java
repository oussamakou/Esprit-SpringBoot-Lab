package tn.esprit.springbootlab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.etudiant;
import tn.esprit.springbootlab.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    EtudiantRepository etudiantRepository;

    @Override
    public List<etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public etudiant addEtudiant(etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public etudiant updateEtudiant(etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
