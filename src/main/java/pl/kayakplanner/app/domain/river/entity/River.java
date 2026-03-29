package pl.kayakplanner.app.domain.river.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;
import pl.kayakplanner.app.domain.riversection.entity.RiverSection;

/**
 * Represents a river as a top-level, canonical domain entity.
 *
 * A River defines the main geographical and logical container for all river-related data.
 * It serves as a reference point for {@link RiverSection} and {@link RiverPoint},
 * enabling grouping, navigation, and reuse across the system.
 *
 * A River is:
 * - global and reusable (not user-specific)
 * - relatively stable over time
 * - identified by a unique ID and basic metadata (e.g. name)
 *
 * Relationships:
 * - one River can have many {@link RiverSection}s
 * - one River can have many {@link RiverPoint}s
 */
@Entity
@Table(name = "river")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
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