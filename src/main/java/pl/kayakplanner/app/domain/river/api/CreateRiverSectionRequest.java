package pl.kayakplanner.app.domain.river.api;

import jakarta.validation.constraints.NotBlank;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.river.entity.RiverPoint;
import pl.kayakplanner.app.domain.utils.Source;

public record CreateRiverSectionRequest(
        @NotBlank String name,
        River river,
        Source source,
        Double startKm,
        Double endKm,
        RiverPoint startPoint,
        RiverPoint endPoint,
        String description
) {}
