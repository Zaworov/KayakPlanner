package pl.kayakplanner.app.domain.route.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.route.utils.RouteConnectionType;

/**
 * Represents a directed connection between two RoutePoints.
 *
 * Connections form a graph structure which allows:
 * - linear routes
 * - branches
 * - alternative endings
 * - optional detours
 *
 */
@Entity
@Table(name = "route_connection")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RouteConnection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne(optional = false)
    @JoinColumn(name = "from_point_id")
    private RoutePoint fromPoint;

    @ManyToOne(optional = false)
    @JoinColumn(name = "to_point_id")
    private RoutePoint toPoint;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RouteConnectionType type;

    private String description;

    @Builder(setterPrefix = "with")
    private RouteConnection(
            Route route,
            RoutePoint fromPoint,
            RoutePoint toPoint,
            RouteConnectionType type,
            String description
    ) {
        this.route = route;
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.type = type;
        this.description = description;
    }
}