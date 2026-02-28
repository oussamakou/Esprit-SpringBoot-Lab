package tn.esprit.springbootlab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.chambre;
import tn.esprit.springbootlab.repositories.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private final ChambreRepository chambreRepository;

    @Override
    public List<chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public chambre retrieveChambre(Integer idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public chambre addChambre(chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public chambre updateChambre(chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(Integer idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
