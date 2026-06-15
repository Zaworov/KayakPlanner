package pl.kayakplanner.app.domain.route.api;

import pl.kayakplanner.app.domain.route.entity.Route;
import pl.kayakplanner.app.domain.route.entity.RoutePoint;
import pl.kayakplanner.app.domain.route.utils.RouteConnectionType;

public record CreateRouteConnectionRequest(
        Route route,
        RoutePoint fromPoint,
        RoutePoint toPoint,
        RouteConnectionType type,
        String description
) {}
