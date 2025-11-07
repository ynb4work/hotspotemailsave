 -- create schema hotspot
CREATE SCHEMA IF NOT EXISTS hotspot;

-- create table users with unique constraint
CREATE TABLE IF NOT EXISTS hotspot.users (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
