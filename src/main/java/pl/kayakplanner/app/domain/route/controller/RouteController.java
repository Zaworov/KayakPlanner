package pl.kayakplanner.app.domain.route.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.route.api.CreateRouteRequest;
import pl.kayakplanner.app.domain.route.dto.RouteDto;
import pl.kayakplanner.app.domain.route.service.RouteService;

import java.util.List;

@RestController
@RequestMapping("api/routes")
public class RouteController {

    private final RouteService service;

    public RouteController(RouteService service) {
        this.service = service;
    }

    @GetMapping
    public List<RouteDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RouteDto get(@PathVariable Long id) {
        return RouteDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RouteDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRouteRequest request
    ) {
        return RouteDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RouteDto create(@Valid @RequestBody CreateRouteRequest req) {
        return RouteDto.from(service.create(req));
    }
}
