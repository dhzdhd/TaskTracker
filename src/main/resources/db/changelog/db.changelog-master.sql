--liquibase formatted sql
--changeset migration:4

CREATE SEQUENCE task_seq START 1;

CREATE TABLE IF NOT EXISTS task
(
    id          INT PRIMARY KEY,
    title       TEXT,
    description TEXT,
    completed   BOOLEAN,
    priority    TEXT,
    due_date    DATE
);
