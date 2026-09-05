package pl.kayakplanner.app.domain.route.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kayakplanner.app.domain.route.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {
}
