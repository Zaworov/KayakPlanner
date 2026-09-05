package pl.kayakplanner.app.domain.route.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import pl.kayakplanner.app.domain.route.entity.Route;

/***
 * DTO representation of entity: {@link Route}.
 */
@AllArgsConstructor
@Getter
@Setter
public class RouteDto {
    private Long id;

    private String name;

    private String description;

    public static RouteDto from(Route route) {
        return new RouteDto(
                route.getId(),
                route.getName(),
                route.getDescription());
    }

    public Route toEntity() {
        return Route.builder()
                .withName(name)
                .withDescription(description)
                .build();
    }
}