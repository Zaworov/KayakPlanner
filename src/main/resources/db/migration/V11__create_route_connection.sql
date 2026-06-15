CREATE TABLE route_connection (
    id SERIAL PRIMARY KEY,
    route_id INT NOT NULL,
    from_point_id INT NOT NULL,
    to_point_id INT NOT NULL,
    description TEXT,
    route_connection_type TEXT NOT NULL,

    CONSTRAINT fk_route_connection_to_route
        FOREIGN KEY (route_id)
        REFERENCES route(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_route_connection_to_from_point
        FOREIGN KEY (from_point_id)
        REFERENCES route_point(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_route_connection_to_to_point
        FOREIGN KEY (to_point_id)
        REFERENCES route_point(id)
        ON DELETE CASCADE
);