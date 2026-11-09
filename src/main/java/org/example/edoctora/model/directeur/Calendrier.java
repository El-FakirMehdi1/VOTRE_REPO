
package org.example.edoctora.model.directeur;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "directeur_pole_calendrier")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calendrier {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "action", length = 500, nullable = false)
    private String action;

    @Column(name = "dateDebut", nullable = false)
    private LocalDate dateDebut;

    @Column(name = "dateFin", nullable = false)
    private LocalDate dateFin;

    @Column(name = "pour", length = 50, nullable = false)
    private String pour;
}
