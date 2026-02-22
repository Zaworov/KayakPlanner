CREATE TABLE river (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL UNIQUE,
    length_km DOUBLE PRECISION,
    country TEXT NOT NULL,
    region TEXT,
    description TEXT
);