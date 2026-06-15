package pl.kayakplanner.app.domain.route.api;

import jakarta.validation.constraints.NotNull;
import pl.kayakplanner.app.domain.river.entity.RiverPoint;
import pl.kayakplanner.app.domain.route.entity.Route;

public record CreateRoutePointRequest (
    @NotNull Route route,

    RiverPoint riverPoint,

    String name,

    String description,

    Double latitude,

    Double longitude
    ) {}
