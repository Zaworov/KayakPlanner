package pl.kayakplanner.app.domain.route.api;

public record CreateRouteRequest(
        String name,

        String description
) {}