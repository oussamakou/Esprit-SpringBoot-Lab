package tn.esprit.springbootlab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootlab.entities.bloc;
import tn.esprit.springbootlab.services.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocRestController {

    IBlocService blocService;

    // GET http://localhost:9090/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<bloc> retrieveAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    // GET http://localhost:9090/bloc/retrieve-bloc/1
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public bloc retrieveBloc(@PathVariable("bloc-id") Long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    // POST http://localhost:9090/bloc/add-bloc
    @PostMapping("/add-bloc")
    public bloc addBloc(@RequestBody bloc b) {
        return blocService.addBloc(b);
    }

    // PUT http://localhost:9090/bloc/update-bloc
    @PutMapping("/update-bloc")
    public bloc updateBloc(@RequestBody bloc b) {
        return blocService.updateBloc(b);
    }

    // DELETE http://localhost:9090/bloc/remove-bloc/1
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long idBloc) {
        blocService.removeBloc(idBloc);
    }
}
