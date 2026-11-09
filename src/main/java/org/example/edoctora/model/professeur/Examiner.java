package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;
import org.example.edoctora.model.candidat.Candidat;

@Entity
@Table(name = "professeur_examiner")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Examiner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String decision;

    @Column(nullable = false)
    private Float noteDossier;

    @Column(nullable = false)
    private Integer noteEntretien;

    @Column(nullable = false)
    private Boolean publier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sujet_id", nullable = false)
    private Sujet sujet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidat_id", nullable = false)
    private Candidat candidat;

    @Column(nullable = false)
    private Boolean valider;
}