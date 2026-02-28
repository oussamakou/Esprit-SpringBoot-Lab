package tn.esprit.springbootlab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.bloc;
import tn.esprit.springbootlab.repositories.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor  // ✅ Injection de Dépendance par Constructeur (via Lombok)
public class BlocServiceImpl implements IBlocService {

    // Spring injecte automatiquement une instance de BlocRepository ici
    BlocRepository blocRepository;

    @Override
    public List<bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public bloc addBloc(bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public bloc updateBloc(bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
