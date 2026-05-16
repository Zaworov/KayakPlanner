INSERT INTO obstacle (
    name,
    river_id,
    river_km,
    latitude,
    longitude,
    obstacle_type,
    difficulty,
    requires_portage,
    source,
    verified,
    description
)

VALUES
('Kłoda',
 (SELECT id FROM river WHERE name='Wda'),
 15.0,
 54.0985,
 17.7840,
 'FALLEN_TREE',
 'MODERATE',
 TRUE,
 'ADMIN',
 TRUE,
 'Przykładowa przeszkoda');