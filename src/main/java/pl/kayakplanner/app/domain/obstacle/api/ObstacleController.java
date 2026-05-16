package pl.kayakplanner.app.domain.obstacle.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.kayakplanner.app.domain.obstacle.dto.ObstacleDto;
import pl.kayakplanner.app.domain.obstacle.service.ObstacleService;

import java.util.List;

@RestController
@RequestMapping("api/rivers/{riverId}/obstacles")
public class ObstacleController {

    private final ObstacleService service;

    public ObstacleController(ObstacleService service) {
        this.service = service;
    }

    @GetMapping
    public List<ObstacleDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ObstacleDto get(@PathVariable Long id) {
        return ObstacleDto.from(service.getById(id));
    }

    @PutMapping("/{id}")
    public ObstacleDto update(
            @PathVariable Long id,
            @Valid @RequestBody ObstacleRequest request
    ) {
        return ObstacleDto.from(service.update(id, request));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ObstacleDto create(@Valid @RequestBody ObstacleRequest req) {
        return ObstacleDto.from(service.create(req));
    }
}
