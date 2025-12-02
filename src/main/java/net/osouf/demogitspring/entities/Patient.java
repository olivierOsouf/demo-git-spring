package net.osouf.demogitspring.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=30, nullable = false)
    private String nom;
}
