package tn.esprit.springbootlab.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

@Entity
public class chambre {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeC typeChambre;

    @ManyToOne
    private bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private List<reservation> reservations;
}
