package tn.esprit.springbootlab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
public class reservation {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
    private String idReservation;
    private Date dateReservation;
    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<etudiant> etudiants;
}
