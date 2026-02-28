package tn.esprit.springbootlab.services;

import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.foyer;
import tn.esprit.springbootlab.repositories.FoyerRepository;

import java.util.List;

@Service
public class FoyerServiceImpl implements IFoyerService {

    private final FoyerRepository foyerRepository;

    public FoyerServiceImpl(FoyerRepository foyerRepository) {
        this.foyerRepository = foyerRepository;
    }

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
