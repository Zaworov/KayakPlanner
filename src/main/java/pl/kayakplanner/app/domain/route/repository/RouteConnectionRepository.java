package pl.kayakplanner.app.domain.route.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.route.entity.RouteConnection;

public interface RouteConnectionRepository extends JpaRepository<RouteConnection, Long> {
}
