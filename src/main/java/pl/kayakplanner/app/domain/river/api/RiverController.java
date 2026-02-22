package pl.kayakplanner.app.domain.river.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.river.dto.RiverDto;
import pl.kayakplanner.app.domain.river.service.RiverService;

import java.util.List;

@RestController
@RequestMapping("api/rivers")
public class RiverController {

    private final RiverService service;

    public RiverController(RiverService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiverDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RiverDto get(@PathVariable Long id) {
        return RiverDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public RiverDto update(
            @PathVariable Long id,
            @Valid @RequestBody CreateRiverRequest request
    ) {
        return RiverDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RiverDto create(@Valid @RequestBody CreateRiverRequest req) {
        return RiverDto.from(service.create(req));
    }
}
