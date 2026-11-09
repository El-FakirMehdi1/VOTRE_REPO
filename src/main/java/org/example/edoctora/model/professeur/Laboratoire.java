package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeur_laboratoire")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Laboratoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    private String nomLaboratoire;

    @Lob
    private String description;

    @Column(length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ced_id", nullable = false)
    private Ced ced;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "directeur_id", nullable = false)
    private Professeur directeur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;
}