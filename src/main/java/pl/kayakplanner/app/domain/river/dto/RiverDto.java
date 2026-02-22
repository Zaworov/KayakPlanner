package pl.kayakplanner.app.domain.river.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.entity.River;

@AllArgsConstructor
@Setter
public class RiverDto {
    private Long id;

    private String name;

    private Double lengthKm;

    private String country;

    private String region;

    private String description;

    public static RiverDto from(River river) {
        return new RiverDto(
                river.getId(),
                river.getName(),
                river.getLengthKm(),
                river.getCountry(),
                river.getRegion(),
                river.getDescription()
        );
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
