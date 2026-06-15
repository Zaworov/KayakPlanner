package pl.kayakplanner.app.domain.route.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.river.entity.RiverPoint;

/**
 * Represents a point within a Route.
 *
 * A RoutePoint may reference an existing RiverPoint
 * or exist independently as a user-defined point.
 *
 * Examples:
 * - river access point
 * - campsite
 * - lunch stop
 * - attraction
 * - custom waypoint
 */
@Entity
@Table(name = "route_point")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RoutePoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "river_point_id")
    private RiverPoint riverPoint;

    @Column(nullable = false)
    private String name;

    private String description;

    private Double latitude;

    private Double longitude;

    @Builder(setterPrefix = "with")
    private RoutePoint(
            Route route,
            RiverPoint riverPoint,
            String name,
            String description,
            Double latitude,
            Double longitude
    ) {
        this.route = route;
        this.riverPoint = riverPoint;
        this.name = name;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}