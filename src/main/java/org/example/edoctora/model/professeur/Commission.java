package org.example.edoctora.model.professeur;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "professeur_commission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dateCommission;

    @Column(length = 255, nullable = false)
    private String lieu;

    @Column(nullable = false)
    private LocalTime heure;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "labo_id", nullable = false)
    private Laboratoire laboratoire;
}