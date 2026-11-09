package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeur_professeur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String cin;

    @Column(length = 30)
    private String telProfesseur;

    @Column(length = 200)
    private String pathPhoto;

    @Column(length = 10)
    private String grade;

    @Column(length = 50)
    private String numSOM;

    @Column(nullable = false)
    private Integer nombreEncadrer;

    @Column(nullable = false)
    private Integer nombreProposer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etablissement_id", nullable = false)
    private Etablissement etablissement;

    // Le PDF ne précise pas de relation FK pour labo_id
    @Column(name = "labo_id")
    private Long laboId;

    // user_id est un entier dans le PDF
    @Column(name = "user_id", nullable = false)
    private Integer userId;
}