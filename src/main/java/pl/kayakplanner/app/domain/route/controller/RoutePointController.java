package pl.kayakplanner.app.domain.route.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.route.api.CreateRoutePointRequest;
import pl.kayakplanner.app.domain.route.dto.RoutePointDto;
import pl.kayakplanner.app.domain.route.service.RoutePointService;

import java.util.List;

@RestController
@RequestMapping("api/route-points")
public class RoutePointController {

    private final RoutePointService service;

    public RoutePointController(RoutePointService service) {
        this.service = service;
    }

    @GetMapping
    public List<RoutePointDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RoutePointDto get(@PathVariable Long id) {
        return RoutePointDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RoutePointDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRoutePointRequest request
    ) {
        return RoutePointDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RoutePointDto create(@Valid @RequestBody CreateRoutePointRequest request) {
        return RoutePointDto.from(service.create(request));
    }
}
