package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "professeur_ced")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ced {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;

    @Column(length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initiale;

    @Column(length = 255, nullable = false)
    private String titre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "directeur_id")
    private Professeur directeur;
}