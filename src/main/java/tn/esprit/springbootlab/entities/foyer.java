package tn.esprit.springbootlab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//Must Have args constructors
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
public class foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nom;
    private long capaciteFoyer;

    @OneToOne
    private universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private List<bloc> blocs;
}
