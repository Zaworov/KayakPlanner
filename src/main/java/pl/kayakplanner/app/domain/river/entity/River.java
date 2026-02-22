package pl.kayakplanner.app.domain.river.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "river")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class River{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private Double lengthKm;

    @Column(nullable = false)
    private String country;

    private String region;

    @Column(length = 2000)
    private String description;

    @Builder(setterPrefix = "with")
    private River(
            String name,
            Double lengthKm,
            String country,
            String region,
            String description
    ) {
        this.name = name;
        this.lengthKm = lengthKm;
        this.country = country;
        this.region = region;
        this.description = description;
    }
}