package pl.kayakplanner.app.domain.obstacle.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.obstacle.Difficulty;
import pl.kayakplanner.app.domain.obstacle.ObstacleType;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.utils.Source;


@Entity
@Table(name = "obstacle")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Obstacle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "river_id", nullable = false)
    private River river;

    @Column(nullable = false)
    private Double riverKm;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ObstacleType type;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private Boolean requiresPortage;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private Source source; // OFFICIAL / USER

    private Boolean verified;

    @Builder(setterPrefix = "with")
    private Obstacle(
            String name,
            River river,
            Double riverKm,
            Double latitude,
            Double longitude,
            ObstacleType type,
            Difficulty difficulty,
            Boolean requiresPortage,
            String description,
            Source source,
            Boolean verified
            ) {
        this.name = name;
        this.river = river;
        this.riverKm = riverKm;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.difficulty = difficulty;
        this.requiresPortage = requiresPortage;
        this.description = description;
        this.source = source;
        this.verified = verified;
    }
}