CREATE TABLE river_section (
    id SERIAL PRIMARY KEY,
    river_id INT NOT NULL,
    name VARCHAR(200),
    start_km NUMERIC NOT NULL,
    end_km NUMERIC NOT NULL,
    start_point_id INT,
    end_point_id INT,
    source TEXT NOT NULL,
    description TEXT,

    CONSTRAINT fk_section_river
        FOREIGN KEY (river_id)
        REFERENCES river(id)
        ON DELETE CASCADE
);