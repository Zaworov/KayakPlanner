CREATE TABLE river_point (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    type TEXT NOT NULL,
    river_id INT NOT NULL,
    river_km DOUBLE PRECISION,
    river_order INT,
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION,
    description TEXT,

    CONSTRAINT fk_point_river
        FOREIGN KEY (river_id)
        REFERENCES river(id)
        ON DELETE CASCADE
);

CREATE INDEX idx_river_point_river
ON river_point(river_id, river_order);