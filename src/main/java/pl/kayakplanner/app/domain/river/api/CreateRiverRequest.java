package pl.kayakplanner.app.domain.river.api;

import jakarta.validation.constraints.NotBlank;

public record CreateRiverRequest(
        @NotBlank String name,
        Double lengthKm,
        @NotBlank String country,
        String region,
        String description
) {}
