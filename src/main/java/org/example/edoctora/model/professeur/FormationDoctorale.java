package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "professeur_formationdoctorale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FormationDoctorale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initiale;

    @Column(length = 255, nullable = false)
    private String titre;

    @Lob
    private String axeDeRecherche;

    private LocalDate dateAccreditation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}