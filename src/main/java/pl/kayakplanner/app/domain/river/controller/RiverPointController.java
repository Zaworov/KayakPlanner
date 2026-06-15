package pl.kayakplanner.app.domain.river.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.river.api.CreateRiverPointRequest;
import pl.kayakplanner.app.domain.river.dto.RiverPointDto;
import pl.kayakplanner.app.domain.river.service.RiverPointService;

import java.util.List;

@RestController
@RequestMapping("api/rivers/{riverId}/points")
public class RiverPointController {

    private final RiverPointService service;

    public RiverPointController(RiverPointService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiverPointDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RiverPointDto get(@PathVariable Long id) {
        return RiverPointDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RiverPointDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRiverPointRequest request
    ) {
        return RiverPointDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RiverPointDto create(@Valid @RequestBody CreateRiverPointRequest req) {
        return RiverPointDto.from(service.create(req));
    }
}
