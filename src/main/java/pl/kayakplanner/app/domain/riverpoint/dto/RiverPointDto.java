package pl.kayakplanner.app.domain.riverpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import pl.kayakplanner.app.domain.riverpoint.RiverPointType;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;

@AllArgsConstructor
@Setter
public class RiverPointDto {
    private Long id;

    private String name;

    private Double riverKm;

    private Integer riverOrder;

    private Double latitude;

    private Double longitude;

    private RiverPointType type;

    private String description;

    public static RiverPointDto from(RiverPoint riverPoint) {
        return new RiverPointDto(
                riverPoint.getId(),
                riverPoint.getName(),
                riverPoint.getRiverKm(),
                riverPoint.getRiverOrder(),
                riverPoint.getLatitude(),
                riverPoint.getLongitude(),
                riverPoint.getType(),
                riverPoint.getDescription());
    }

    public RiverPoint toEntity() {
        return RiverPoint.builder()
                .withName(name)
                .withRiverKm(riverKm)
                .withRiverOrder(riverOrder)
                .withLatitude(latitude)
                .withLongitude(longitude)
                .withType(type)
                .withDescription(description)
                .build();
    }
}
