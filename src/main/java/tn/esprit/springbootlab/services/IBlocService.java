package tn.esprit.springbootlab.services;

import tn.esprit.springbootlab.entities.bloc;

import java.util.List;

public interface IBlocService {
    List<bloc> retrieveAllBlocs();
    bloc retrieveBloc(Long idBloc);
    bloc addBloc(bloc b);
    bloc updateBloc(bloc b);
    void removeBloc(Long idBloc);
}
