package pl.kayakplanner.app.domain.river.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.river.api.CreateRiverSectionRequest;
import pl.kayakplanner.app.domain.river.dto.RiverSectionDto;
import pl.kayakplanner.app.domain.river.service.RiverSectionService;

import java.util.List;

@RestController
@RequestMapping("api/rivers/{riverId}/sections")
public class RiverSectionController {

    private final RiverSectionService service;

    public RiverSectionController(RiverSectionService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiverSectionDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RiverSectionDto get(@PathVariable Long id) {
        return RiverSectionDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RiverSectionDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRiverSectionRequest request
    ) {
        return RiverSectionDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RiverSectionDto create(@Valid @RequestBody CreateRiverSectionRequest req) {
        return RiverSectionDto.from(service.create(req));
    }
}
