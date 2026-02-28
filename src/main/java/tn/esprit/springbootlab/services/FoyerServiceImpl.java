package tn.esprit.springbootlab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.foyer;
import tn.esprit.springbootlab.repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    FoyerRepository foyerRepository;

    @Override
    public List<foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public foyer addFoyer(foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public foyer updateFoyer(foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
}
