package pl.kayakplanner.app.domain.riversection.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;
import pl.kayakplanner.app.domain.utils.Source;

/**
 * Represents a larger, logical, and reusable part of a river.
 *
 * A RiverSection defines a continuous stretch of a river between two locations,
 * typically determined by river kilometer (e.g. 120 km → 95 km) or specific
 * RiverPoints (such as bridges, towns, or hazards). It is enriched with metadata
 * describing navigability, difficulty, and general characteristics of the river.
 *
 * A RiverSection serves as a canonical, shareable building block:
 * - It represents objective river data, not a user-specific trip.
 * - It can be reused across multiple users and routes.
 * - It is publicly available and may be either official or user-generated
 *   (e.g. derived from a Route).
 *
 * Conceptual distinction:
 * - RiverSection:
 *     - objective and reusable
 *     - represents an existing part of a river
 *
 * - Route:
 *     - subjective and user-defined
 *     - represents a planned trip composed of sections or points
 */
@Entity
@Table(name = "river_section")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RiverSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "river_id")
    private River river;

    @Column(nullable = false)
    private String name;

    private Double startKm;

    private Double endKm;

    private Source source;

    @ManyToOne
    @JoinColumn(name="start_point_id")
    private RiverPoint startPoint;

    @ManyToOne
    @JoinColumn(name="end_point_id")
    private RiverPoint endPoint;

    private String description;

    @PrePersist
    @PreUpdate
    private void validate() {
        validateStart();
        validateEnd();
    }

    private void validateStart() {
        if ((startKm == null && startPoint == null) ||
                (startKm != null && startPoint != null)) {
            throw new IllegalStateException("Exactly one of startKm or startPoint must be set");
        }
    }

    private void validateEnd() {
        if ((endKm == null && endPoint == null) ||
                (endKm != null && endPoint != null)) {
            throw new IllegalStateException("Exactly one of endKm or endPoint must be set");
        }
    }

    @Builder(setterPrefix = "with")
    private RiverSection(
            River river,
            String name,
            Double start_km,
            Double end_km,
            RiverPoint start_point,
            RiverPoint end_point,
            String description,
            Source source
    ) {
        this.river = river;
        this.name = name;
        this.startKm = start_km;
        this.endKm = end_km;
        this.startPoint = start_point;
        this.endPoint = end_point;
        this.description = description;
        this.source = source;
    }
}