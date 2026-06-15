package pl.kayakplanner.app.domain.route.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.route.entity.RoutePoint;

public interface RoutePointRepository extends JpaRepository<RoutePoint, Long> {
}