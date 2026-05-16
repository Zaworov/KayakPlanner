package pl.kayakplanner.app.domain.obstacle.api;

import pl.kayakplanner.app.domain.obstacle.Difficulty;
import pl.kayakplanner.app.domain.obstacle.ObstacleType;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.utils.Source;

public record ObstacleRequest(
        String name,
        River river,
        Double riverKm,
        Double latitude,
        Double longitude,
        ObstacleType type,
        Difficulty difficulty,
        Boolean requiresPortage,
        String description,
        Source source,
        Boolean verified
) {}
