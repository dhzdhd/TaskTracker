--liquibase formatted sql
CREATE TABLE IF NOT EXISTS item
(
    id          INT PRIMARY KEY,
    title       TEXT,
    description TEXT,
    completed   BOOLEAN,
    priority    TEXT,
    due_date    DATE
);

CREATE TABLE IF NOT EXISTS dummy
(
    id          INT PRIMARY KEY,
    title       TEXT,
    description TEXT,
    completed   BOOLEAN,
    priority    TEXT,
    due_date    DATE
);