package pl.kayakplanner.app.domain.obstacle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.obstacle.entity.Obstacle;

import java.util.Optional;

public interface ObstacleRepository extends JpaRepository<Obstacle, Long> {
    Optional<Obstacle> findByName(String name);
}