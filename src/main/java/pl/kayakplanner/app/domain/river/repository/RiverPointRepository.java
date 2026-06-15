package pl.kayakplanner.app.domain.river.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.river.entity.RiverPoint;

import java.util.Optional;

public interface RiverPointRepository extends JpaRepository<RiverPoint, Long> {
    Optional<RiverPoint> findByName(String name);
}