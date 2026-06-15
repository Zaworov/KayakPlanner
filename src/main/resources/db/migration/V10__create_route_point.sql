CREATE TABLE route_point (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    route_id INT NOT NULL,
    river_point_id INT,
    description TEXT,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,

    CONSTRAINT fk_route_point_to_route
        FOREIGN KEY (route_id)
        REFERENCES route(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_route_point_to_river_point
        FOREIGN KEY (river_point_id)
        REFERENCES river_point(id)
        ON DELETE SET NULL
);

