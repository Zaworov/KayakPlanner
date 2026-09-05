package pl.kayakplanner.app.domain.route.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.route.api.CreateRouteRequest;
import pl.kayakplanner.app.domain.route.dto.RouteDto;
import pl.kayakplanner.app.domain.route.entity.Route;
import pl.kayakplanner.app.domain.route.repository.RouteRepository;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository repository;

    public RouteService(RouteRepository repository) {
        this.repository = repository;
    }

    public List<RouteDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RouteDto::from)
                .toList();
    }

    public Route getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route not found"));
    }

    public Route update(Long id, CreateRouteRequest request) {
        Route route = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route not found"));

        route.setName(request.name());
        route.setDescription(request.description());

        return repository.save(route);
    }

    public Route create(CreateRouteRequest request) {
        Route route = Route.builder()
                .withName(request.name())
                .withDescription(request.description())
                .build();

        return repository.save(route);
    }
}