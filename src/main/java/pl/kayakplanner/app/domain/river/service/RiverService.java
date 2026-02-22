package pl.kayakplanner.app.domain.river.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.river.api.CreateRiverRequest;
import pl.kayakplanner.app.domain.river.dto.RiverDto;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.river.repository.RiverRepository;

import java.util.List;

@Service
public class RiverService {

    private final RiverRepository repository;

    public RiverService(RiverRepository repository) {
        this.repository = repository;
    }

    public List<RiverDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RiverDto::from)
                .toList();
    }

    public River getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River not found"));
    }

    public River update(Long id, CreateRiverRequest request) {
        River river = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River not found"));

        river.setName(request.name());
        river.setLengthKm(request.lengthKm());
        river.setCountry(request.country());
        river.setRegion(request.region());
        river.setDescription(request.description());

        return repository.save(river);
    }

    public River create(CreateRiverRequest request) {
        River river = River.builder()
                .withName(request.name())
                .withLengthKm(request.lengthKm())
                .withCountry(request.country())
                .withRegion(request.region())
                .withDescription(request.description())
                .build();

        return repository.save(river);
    }
}
