--liquibase formatted sql

--changeset migration:2
CREATE TABLE IF NOT EXISTS task
(
    id          INT PRIMARY KEY,
    title       TEXT,
    description TEXT,
    completed   BOOLEAN,
    priority    TEXT,
    due_date    DATE
);
