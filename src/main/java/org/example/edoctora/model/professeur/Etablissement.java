package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeur_etablissement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Etablissement {

    @Id
    @Column(name = "idEtablissement", length = 10)
    private String idEtablissement;

    @Column(name = "nomEtablissement",
            length = 255, nullable = false)
    private String nomEtablissement;
}