package pl.kayakplanner.app.domain.route.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.route.api.CreateRouteConnectionRequest;
import pl.kayakplanner.app.domain.route.dto.RouteConnectionDto;
import pl.kayakplanner.app.domain.route.entity.RouteConnection;
import pl.kayakplanner.app.domain.route.repository.RouteConnectionRepository;

import java.util.List;

@Service
public class RouteConnectionService {

    private final RouteConnectionRepository repository;

    public RouteConnectionService(RouteConnectionRepository repository) {
        this.repository = repository;
    }

    public List<RouteConnectionDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RouteConnectionDto::from)
                .toList();
    }

    public RouteConnection getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route connection not found"));
    }

    public RouteConnection update(Long id, CreateRouteConnectionRequest request) {
        RouteConnection routeConnection = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route connection not found"));

        routeConnection.setFromPoint(request.fromPoint());
        routeConnection.setToPoint(request.toPoint());
        routeConnection.setType(request.type());
        routeConnection.setDescription(request.description());

        return repository.save(routeConnection);
    }

    public RouteConnection create(CreateRouteConnectionRequest request) {
        RouteConnection routeConnection = RouteConnection.builder()
                .withRoute(request.route())
                .withFromPoint(request.fromPoint())
                .withToPoint(request.toPoint())
                .withType(request.type())
                .withDescription(request.description())
                .build();

        return repository.save(routeConnection);
    }
}
