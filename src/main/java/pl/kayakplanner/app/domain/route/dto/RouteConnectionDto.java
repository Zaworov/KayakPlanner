package pl.kayakplanner.app.domain.route.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.river.dto.RiverPointDto;
import pl.kayakplanner.app.domain.route.entity.Route;
import pl.kayakplanner.app.domain.route.entity.RouteConnection;
import pl.kayakplanner.app.domain.route.entity.RoutePoint;
import pl.kayakplanner.app.domain.route.utils.RouteConnectionType;

import java.util.List;

/***
 * DTO representation of entity: {@link RouteConnection}.
 */
@AllArgsConstructor
@Getter
@Setter
public class RouteConnectionDto {
    private Long id;

    private Route route;

    private RoutePoint fromPoint;

    private RoutePoint toPoint;

    private RouteConnectionType type;

    private String description;

    public static RouteConnectionDto from(RouteConnection routeConnection) {
        return new RouteConnectionDto(
                routeConnection.getId(),
                routeConnection.getRoute(),
                routeConnection.getFromPoint(),
                routeConnection.getToPoint(),
                routeConnection.getType(),
                routeConnection.getDescription());
    }

    public RouteConnection toEntity() {
        return RouteConnection.builder()
                .withRoute(route)
                .withFromPoint(fromPoint)
                .withToPoint(toPoint)
                .withType(type)
                .withDescription(description)
                .build();
    }
}
