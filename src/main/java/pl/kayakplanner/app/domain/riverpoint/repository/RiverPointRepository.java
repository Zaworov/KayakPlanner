package pl.kayakplanner.app.domain.riverpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.riverpoint.entity.RiverPoint;

import java.util.Optional;

public interface RiverPointRepository extends JpaRepository<RiverPoint, Long> {
    Optional<RiverPoint> findByName(String name);
}