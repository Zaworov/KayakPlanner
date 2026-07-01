CREATE TABLE point_of_interest
(
    id          SERIAL PRIMARY KEY,
    river_id    INT          NOT NULL,
    name        VARCHAR(200) NOT NULL,
    category    VARCHAR(50)  NOT NULL,
    river_km    NUMERIC,
    description TEXT,
    source      TEXT         NOT NULL,
    latitude    NUMERIC(9, 6),
    longitude   NUMERIC(9, 6),

    CONSTRAINT fk_poi_river
        FOREIGN KEY (river_id)
            REFERENCES river (id)
            ON DELETE CASCADE
);