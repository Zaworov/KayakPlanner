package pl.kayakplanner.app.domain.river.api;

import jakarta.validation.constraints.NotBlank;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.river.utils.RiverPointType;

public record CreateRiverPointRequest(
        @NotBlank String name,
        River river,
        Double riverKm,
        Double latitude,
        Double longitude,
        RiverPointType type,
        String description
) {}
