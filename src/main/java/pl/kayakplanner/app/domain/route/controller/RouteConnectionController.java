package pl.kayakplanner.app.domain.route.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.route.api.CreateRouteConnectionRequest;
import pl.kayakplanner.app.domain.route.dto.RouteConnectionDto;
import pl.kayakplanner.app.domain.route.service.RouteConnectionService;

import java.util.List;

@RestController
@RequestMapping("api/route-connections")
public class RouteConnectionController {

    private final RouteConnectionService service;

    public RouteConnectionController(RouteConnectionService service) {
        this.service = service;
    }

    @GetMapping
    public List<RouteConnectionDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RouteConnectionDto get(@PathVariable Long id) {
        return RouteConnectionDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RouteConnectionDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRouteConnectionRequest request
    ) {
        return RouteConnectionDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RouteConnectionDto create(@Valid @RequestBody CreateRouteConnectionRequest req) {
        return RouteConnectionDto.from(service.create(req));
    }
}
