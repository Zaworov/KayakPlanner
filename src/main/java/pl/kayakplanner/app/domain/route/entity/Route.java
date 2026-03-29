package pl.kayakplanner.app.domain.route.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;
import pl.kayakplanner.app.domain.riversection.entity.RiverSection;

/**
 * Represents a user-defined kayaking route along a river.
 *
 * A Route describes a planned trip composed of one or more segments
 * (e.g. {@link RiverSection}s or {@link RiverPoint}s), typically created
 * by a user to organize and visualize a kayaking journey.
 *
 * Unlike {@link RiverSection}, which represents objective and reusable
 * parts of a river, a Route is:
 * - subjective and user-specific
 * - editable and customizable
 * - focused on trip planning rather than raw river data
 *
 * A Route may include:
 * - a start and end point (e.g. {@link RiverPoint})
 * - intermediate waypoints or segments
 * - metadata such as name, description, or duration
 *
 * Routes can be:
 * - private (visible only to the creator)
 * - shared or published for other users
 *
 * Typical use cases:
 * - planning a single or multi-day kayaking trip
 * - saving favorite routes
 * - sharing recommended trips with the community
 */
@Entity
@Table(name = "route")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}