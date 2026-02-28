package tn.esprit.springbootlab.services;

import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.etudiant;
import tn.esprit.springbootlab.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImpl implements IEtudiantService {

    private final EtudiantRepository etudiantRepository;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

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
