package pl.kayakplanner.app.domain.river.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.dto.RiverPointDto;

import java.util.List;

/***
 * DTO representation of entity: {@link River}.
 */
@AllArgsConstructor
@Getter
@Setter
public class RiverDto {
    private Long id;

    private String name;

    private Double lengthKm;

    private String country;

    private String region;

    private String description;

    private List<RiverPointDto> riverPoints;

    public static RiverDto from(River river) {
        return new RiverDto(
                river.getId(),
                river.getName(),
                river.getLengthKm(),
                river.getCountry(),
                river.getRegion(),
                river.getDescription(),

                river.getPoints().stream()
                        .map(RiverPointDto::from)
                        .toList());
    }

    public River toEntity() {
        return River.builder()
                .withName(name)
                .withLengthKm(lengthKm)
                .withCountry(country)
                .withRegion(region)
                .withDescription(description)
                .build();
    }
}
