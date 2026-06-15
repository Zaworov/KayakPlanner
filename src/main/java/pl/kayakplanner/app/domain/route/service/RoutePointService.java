package pl.kayakplanner.app.domain.route.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.route.api.CreateRoutePointRequest;
import pl.kayakplanner.app.domain.route.dto.RoutePointDto;
import pl.kayakplanner.app.domain.route.entity.RoutePoint;
import pl.kayakplanner.app.domain.route.repository.RoutePointRepository;

import java.util.List;

@Service
public class RoutePointService {

    private final RoutePointRepository repository;

    public RoutePointService(RoutePointRepository repository) {
        this.repository = repository;
    }

    public List<RoutePointDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RoutePointDto::from)
                .toList();
    }

    public RoutePoint getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route point not found"));
    }

    public RoutePoint update(Long id, CreateRoutePointRequest request) {
        RoutePoint routePoint = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Route point not found"));

        routePoint.setName(request.name());
        routePoint.setRiverPoint(request.riverPoint());
        routePoint.setLatitude(request.latitude());
        routePoint.setLongitude(request.longitude());
        routePoint.setDescription(request.description());

        return repository.save(routePoint);
    }

    public RoutePoint create(CreateRoutePointRequest request) {
        RoutePoint routePoint = RoutePoint.builder()
                .withName(request.name())
                .withRiverPoint(request.riverPoint())
                .withLatitude(request.latitude())
                .withLongitude(request.longitude())
                .withDescription(request.description())
                .build();

        return repository.save(routePoint);
    }
}
