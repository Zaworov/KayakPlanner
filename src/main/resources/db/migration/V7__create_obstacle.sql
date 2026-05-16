CREATE TABLE obstacle (
    id SERIAL PRIMARY KEY,
    name TEXT,
    river_id INT NOT NULL,
    river_km DOUBLE PRECISION,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,
    obstacle_type TEXT NOT NULL,
    difficulty TEXT NOT NULL,
    requires_portage BOOLEAN,
    source TEXT NOT NULL,
    verified BOOLEAN,
    description TEXT,

    CONSTRAINT fk_obstacle
        FOREIGN KEY (river_id)
        REFERENCES river(id)
        ON DELETE CASCADE
);