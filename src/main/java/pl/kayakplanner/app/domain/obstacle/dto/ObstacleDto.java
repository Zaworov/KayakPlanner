package pl.kayakplanner.app.domain.obstacle.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import pl.kayakplanner.app.domain.obstacle.Difficulty;
import pl.kayakplanner.app.domain.obstacle.ObstacleType;
import pl.kayakplanner.app.domain.obstacle.entity.Obstacle;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.utils.Source;

/***
 * DTO representation of entity: {@link Obstacle}.
 */
@AllArgsConstructor
@Setter
public class ObstacleDto {
    private Long id;

    private Long riverId;

    private Double riverKm;

    private Double latitude;

    private Double longitude;

    private ObstacleType type;

    private Difficulty difficulty;

    private Boolean requiresPortage;

    private String description;

    private Source source;

    private Boolean verified;

    public static ObstacleDto from(Obstacle obsctacle) {
        return new ObstacleDto(
                obsctacle.getId(),
                obsctacle.getRiver().getId(),
                obsctacle.getRiverKm(),
                obsctacle.getLatitude(),
                obsctacle.getLongitude(),
                obsctacle.getType(),
                obsctacle.getDifficulty(),
                obsctacle.getRequiresPortage(),
                obsctacle.getDescription(),
                obsctacle.getSource(),
                obsctacle.getVerified()
                );
    }

    public Obstacle toEntity() {
        River river = new River();
        river.setId(id);
        return Obstacle.builder()
                .withRiver(river)
                .withRiverKm(riverKm)
                .withLatitude(latitude)
                .withLongitude(longitude)
                .withType(type)
                .withDifficulty(difficulty)
                .withRequiresPortage(requiresPortage)
                .withDescription(description)
                .withSource(source)
                .withVerified(verified)
                .build();
    }
}
