--liquibase formatted sql
--changeset migration:5

CREATE SEQUENCE IF NOT EXISTS task_seq START 1;
CREATE SEQUENCE IF NOT EXISTS user_seq START 1;

CREATE TABLE IF NOT EXISTS tasks
(
    id          INT PRIMARY KEY,
    title       TEXT    NOT NULL,
    description TEXT    NOT NULL,
    completed   BOOLEAN NOT NULL,
    priority    TEXT    NOT NULL,
    due_date    DATE    NOT NULL,
    created_at  DATE    NOT NULL,
    updated_at  DATE    NOT NULL
);

CREATE TABLE IF NOT EXISTS users
(
    id         INT PRIMARY KEY,
    name       TEXT NOT NULL,
    email      TEXT NOT NULL,
    password   TEXT NOT NULL,
    created_at DATE NOT NULL,
    updated_at DATE NOT NULL
)