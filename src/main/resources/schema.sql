CREATE TABLE passengers (
                            id BIGSERIAL PRIMARY KEY,
                            name VARCHAR(100),
                            email VARCHAR(100),
                            phone VARCHAR(20)
);

CREATE TABLE trains (
                        id BIGSERIAL PRIMARY KEY,
                        train_number VARCHAR(20),
                        total_seats INT,
                        route VARCHAR(100)
);

CREATE TABLE tickets (
                         id BIGSERIAL PRIMARY KEY,
                         passenger_id BIGINT REFERENCES passengers(id),
                         train_id BIGINT REFERENCES trains(id),
                         seat_number VARCHAR(10),
                         departure_time TIMESTAMP,
                         arrival_time TIMESTAMP,
                         price DECIMAL(10, 2)
);
