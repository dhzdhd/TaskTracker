--liquibase formatted sql

--changeset migration:1
CREATE TABLE IF NOT EXISTS item
(
    id          INT PRIMARY KEY,
    title       TEXT,
    description TEXT,
    completed   BOOLEAN,
    priority    TEXT,
    due_date    DATE
);
