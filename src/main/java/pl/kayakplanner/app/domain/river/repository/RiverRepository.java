package pl.kayakplanner.app.domain.river.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.river.entity.River;

import java.util.Optional;

public interface RiverRepository extends JpaRepository<River, Long> {
    Optional<River> findByName(String name);
}