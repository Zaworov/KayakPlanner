package pl.kayakplanner.app.domain.river.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pl.kayakplanner.app.domain.river.api.CreateRiverSectionRequest;
import pl.kayakplanner.app.domain.river.dto.RiverSectionDto;
import pl.kayakplanner.app.domain.river.entity.RiverSection;
import pl.kayakplanner.app.domain.river.repository.RiverSectionRepository;

import java.util.List;

@Service
public class RiverSectionService {

    private final RiverSectionRepository repository;

    public RiverSectionService(RiverSectionRepository repository) {
        this.repository = repository;
    }

    public List<RiverSectionDto> findAll() {
        return repository.findAll()
                .stream()
                .map(RiverSectionDto::from)
                .toList();
    }

    public RiverSection getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River section not found"));
    }

    public RiverSection update(Long id, CreateRiverSectionRequest request) {
        RiverSection riverSection = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("River section not found"));

        riverSection.setName(request.name());
        riverSection.setRiver(request.river());
        riverSection.setSource(request.source());
        riverSection.setStartKm(request.startKm());
        riverSection.setEndKm(request.endKm());
        riverSection.setStartPoint(request.startPoint());
        riverSection.setEndPoint(request.endPoint());
        riverSection.setDescription(request.description());

        return repository.save(riverSection);
    }

    public RiverSection create(CreateRiverSectionRequest request) {
        RiverSection riverSection = RiverSection.builder()
                .withName(request.name())
                .withRiver(request.river())
                .withSource(request.source())
                .withStart_km(request.startKm())
                .withEnd_km(request.endKm())
                .withStart_point(request.startPoint())
                .withEnd_point(request.endPoint())
                .withDescription(request.description())
                .build();

        return repository.save(riverSection);
    }
}
