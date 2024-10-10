-- create schema hotspot
CREATE SCHEMA IF NOT EXISTS hotspot;

-- create tabe guests in schema hotspot
CREATE TABLE IF NOT EXISTS hotspot.guests (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
