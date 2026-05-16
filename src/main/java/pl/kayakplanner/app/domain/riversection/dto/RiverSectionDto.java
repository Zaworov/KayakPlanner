package pl.kayakplanner.app.domain.riversection.dto;

import lombok.AllArgsConstructor;
import lombok.Setter;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.dto.RiverPointDto;
import pl.kayakplanner.app.domain.utils.Source;
import pl.kayakplanner.app.domain.riversection.entity.RiverSection;

/***
 * DTO representation of entity: {@link RiverSection}.
 */
@AllArgsConstructor
@Setter
public class RiverSectionDto {
    private Long id;

    private String name;

    private Long riverId;

    private Double startKm;

    private Double endKm;

    private Source source;

    private RiverPointDto startPoint;

    private RiverPointDto endPoint;

    private String description;

    public static RiverSectionDto from(RiverSection riverSection) {
        return new RiverSectionDto(
                riverSection.getId(),
                riverSection.getName(),
                riverSection.getRiver().getId(),
                riverSection.getStartKm(),
                riverSection.getEndKm(),
                riverSection.getSource(),
                RiverPointDto.from(riverSection.getStartPoint()),
                RiverPointDto.from(riverSection.getEndPoint()),
                riverSection.getDescription());
    }

    public RiverSection toEntity() {
        River river = new River();
        river.setId(id);
        return RiverSection.builder()
                .withName(name)
                .withRiver(river)
                .withStart_km(startKm)
                .withEnd_km(endKm)
                .withSource(source)
                .withStart_point(startPoint.toEntity())
                .withEnd_point(endPoint.toEntity())
                .withDescription(description)
                .build();
    }
}
