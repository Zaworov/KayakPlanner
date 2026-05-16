package pl.kayakplanner.app.domain.riversection.api;

import jakarta.validation.constraints.NotBlank;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;
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
