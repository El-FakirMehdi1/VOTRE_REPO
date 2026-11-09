package org.example.edoctora.model.auth;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "auth_permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255, nullable = false)
    private String name;

    // La table django_content_type n'est pas dans
    // les Models fournis dans notre PDF.
    @Column(name = "content_type_id", nullable = false)
    private Integer contentTypeId;

    @Column(length = 100, nullable = false)
    private String codename;
}