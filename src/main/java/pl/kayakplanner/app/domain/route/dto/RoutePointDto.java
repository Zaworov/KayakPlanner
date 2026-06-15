package pl.kayakplanner.app.domain.route.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kayakplanner.app.domain.route.entity.RoutePoint;

/***
 * DTO representation of entity: {@link RoutePoint}.
 */
@AllArgsConstructor
@Getter
@Setter
public class RoutePointDto {
    private Long id;

    private Long routeId;

    private Long riverPointId;

    private String name;

    private String description;

    private Double latitude;

    private Double longitude;

    public static RoutePointDto from(RoutePoint routePoint) {
        return new RoutePointDto(
                routePoint.getId(),
                routePoint.getRoute().getId(),
                routePoint.getRiverPoint().getId(),
                routePoint.getName(),
                routePoint.getDescription(),
                routePoint.getLatitude(),
                routePoint.getLongitude());
    }

    public RoutePoint toEntity() {
        return RoutePoint.builder()
                .withName(name)
                .withDescription(description)
                .withLatitude(latitude)
                .withLongitude(longitude)
                .build();
    }
}
