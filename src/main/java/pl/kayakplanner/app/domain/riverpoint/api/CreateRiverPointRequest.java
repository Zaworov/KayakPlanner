package pl.kayakplanner.app.domain.riverpoint.api;

import jakarta.validation.constraints.NotBlank;
import pl.kayakplanner.app.domain.riverpoint.RiverPointType;

public record CreateRiverPointRequest(
        @NotBlank String name,
        Double riverKm,
        Double latitude,
        Double longitude,
        RiverPointType type,
        String description
) {}
