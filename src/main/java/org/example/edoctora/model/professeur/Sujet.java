package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeur_sujet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    private String titre;

    @Lob
    private String description;

    @Column(nullable = false)
    private Boolean publier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coDirecteur_id")
    private Professeur coDirecteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "formationDoctorale_id", nullable = false)
    private FormationDoctorale formationDoctorale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professeur_id", nullable = false)
    private Professeur professeur;
}