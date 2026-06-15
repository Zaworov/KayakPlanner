package pl.kayakplanner.app.domain.river.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.river.entity.RiverSection;

import java.util.Optional;

public interface RiverSectionRepository extends JpaRepository<RiverSection, Long> {
    Optional<RiverSection> findByName(String name);
}