package pl.kayakplanner.app.domain.riverpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.RiverPointType;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;

@AllArgsConstructor
@Setter
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
        River river = new River();
        river.setId(id);
        return RiverPoint.builder()
                .withName(name)
                .withRiver(river)
                .withRiverKm(riverKm)
                .withRiverOrder(riverOrder)
                .withLatitude(latitude)
                .withLongitude(longitude)
                .withType(type)
                .withDescription(description)
                .build();
    }
}
