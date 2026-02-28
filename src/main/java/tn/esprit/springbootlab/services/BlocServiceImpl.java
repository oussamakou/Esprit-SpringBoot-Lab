package tn.esprit.springbootlab.services;

import org.springframework.stereotype.Service;
import tn.esprit.springbootlab.entities.bloc;
import tn.esprit.springbootlab.repositories.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImpl implements IBlocService {

    private final BlocRepository blocRepository;

    public BlocServiceImpl(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

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
