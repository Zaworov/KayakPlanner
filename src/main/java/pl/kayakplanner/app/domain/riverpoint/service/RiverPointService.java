package pl.kayakplanner.app.domain.riverpoint.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.riverpoint.api.CreateRiverPointRequest;
import pl.kayakplanner.app.domain.riverpoint.dto.RiverPointDto;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;
import pl.kayakplanner.app.domain.riverpoint.repository.RiverPointRepository;

import java.util.List;

@Service
public class RiverPointService {

    private final RiverPointRepository repository;

    public RiverPointService(RiverPointRepository repository) {
        this.repository = repository;
    }

    public List<RiverPointDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RiverPointDto::from)
                .toList();
    }

    public RiverPoint getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River point not found"));
    }

    public RiverPoint update(Long id, CreateRiverPointRequest request) {
        RiverPoint riverPoint = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River point not found"));

        riverPoint.setName(request.name());
        riverPoint.setType(request.type());
        riverPoint.setRiverKm(request.riverKm());
        riverPoint.setLatitude(request.latitude());
        riverPoint.setLongitude(request.longitude());
        riverPoint.setDescription(request.description());

        return repository.save(riverPoint);
    }

    public RiverPoint create(CreateRiverPointRequest request) {
        RiverPoint riverPoint = RiverPoint.builder()
                .withName(request.name())
                .withType(request.type())
                .withRiverKm(request.riverKm())
                .withLongitude(request.riverKm())
                .withLatitude(request.riverKm())
                .withDescription(request.description())
                .build();

        return repository.save(riverPoint);
    }
}
