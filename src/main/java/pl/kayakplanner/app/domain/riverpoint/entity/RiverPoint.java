package pl.kayakplanner.app.domain.riverpoint.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.RiverPointType;
import pl.kayakplanner.app.domain.riversection.entity.RiverSection;
import pl.kayakplanner.app.domain.route.entity.Route;

/**
 * Represents a specific, identifiable point along a {@link River}.
 *
 * A RiverPoint describes a precise location that can be used as a reference
 * for navigation, planning, or defining boundaries of a {@link RiverSection}.
 * Examples include bridges, towns, hazards, or arbitrary user-defined spots.
 *
 * A RiverPoint may be defined by:
 * - geographic coordinates (latitude, longitude)
 * - river kilometer (distance along the river)
 *
 * It is used as:
 * - a start or end point of a {@link RiverSection}
 * - a building block for user-defined {@link Route}
 *
 * RiverPoints are reusable and can be shared across multiple sections and routes.
 */
@Entity
@Table(name = "river_point")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RiverPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "river_id")
    private River river;

    @Column(nullable = false)
    private String name;

    @Column(name = "river_km")
    private Double riverKm;

    @Column(name = "river_order")
    private Integer riverOrder;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RiverPointType type;

    private String description;

    @Builder(setterPrefix = "with")
    private RiverPoint(
            River river,
            String name,
            Double riverKm,
            Integer riverOrder,
            Double latitude,
            Double longitude,
            RiverPointType type,
            String description
    ) {
        this.river = river;
        this.name = name;
        this.riverKm = riverKm;
        this.riverOrder = riverOrder;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.description = description;
    }
}