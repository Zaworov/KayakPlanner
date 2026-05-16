package pl.kayakplanner.app.domain.obstacle.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.obstacle.api.ObstacleRequest;
import pl.kayakplanner.app.domain.obstacle.dto.ObstacleDto;
import pl.kayakplanner.app.domain.obstacle.entity.Obstacle;
import pl.kayakplanner.app.domain.obstacle.repository.ObstacleRepository;

import java.util.List;

@Service
public class ObstacleService {

    private final ObstacleRepository repository;

    public ObstacleService(ObstacleRepository repository) {
        this.repository = repository;
    }

    public List<ObstacleDto> findAll() {
        return repository.findAll()
                .stream()
                .map(ObstacleDto::from)
                .toList();
    }

    public Obstacle getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Obstacle not found"));
    }

    public Obstacle update(Long id, ObstacleRequest request) {
        Obstacle obstacle = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Obstacle not found"));
        obstacle.setName(request.name());
        obstacle.setRiver(request.river());
        obstacle.setRiverKm(request.riverKm());
        obstacle.setLatitude(request.latitude());
        obstacle.setLongitude(request.longitude());
        obstacle.setType(request.type());
        obstacle.setDifficulty(request.difficulty());
        obstacle.setRequiresPortage(request.requiresPortage());
        obstacle.setDescription(request.description());
        obstacle.setSource(request.source());
        obstacle.setVerified(request.verified());

        return repository.save(obstacle);
    }

    public Obstacle create(ObstacleRequest request) {
        Obstacle riverSection = Obstacle.builder()
                .withName(request.name())
                .withRiver(request.river())
                .withRiverKm(request.riverKm())
                .withLatitude(request.latitude())
                .withLongitude(request.longitude())
                .withType(request.type())
                .withDifficulty(request.difficulty())
                .withRequiresPortage(request.requiresPortage())
                .withDescription(request.description())
                .withSource(request.source())
                .withVerified(request.verified())
                .build();

        return repository.save(riverSection);
    }
}
