package pl.kayakplanner.app.domain.river.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.utils.RiverPointType;
import pl.kayakplanner.app.domain.river.entity.RiverPoint;

@AllArgsConstructor
@Setter
@Getter
public class RiverPointDto {
    private Long id;

    private String name;

    private Long riverId;

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
                riverPoint.getRiver().getId(),
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
