package pl.kayakplanner.app.domain.riverpoint.entity;

import jakarta.persistence.*;
import lombok.*;
import pl.kayakplanner.app.domain.river.entity.River;
import pl.kayakplanner.app.domain.riverpoint.RiverPointType;

@Entity
@Table(name = "river_point")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RiverPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "river_id")
    private River river;

    @Column(nullable = false)
    private String name;

    @Column(name = "river_km")
    private Double riverKm;

    @Column(name = "river_order")
    private Integer riverOrder;

    private Double latitude;
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RiverPointType type;

    private String description;

    @Builder(setterPrefix = "with")
    private RiverPoint(
            River river,
            String name,
            Double riverKm,
            Integer riverOrder,
            Double latitude,
            Double longitude,
            RiverPointType type,
            String description
    ) {
        this.river = river;
        this.name = name;
        this.riverKm = riverKm;
        this.riverOrder = riverOrder;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
        this.description = description;
    }
}