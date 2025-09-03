CREATE TABLE books (
    book_id BIGSERIAL PRIMARY KEY,
    created_at TIMESTAMPTZ NOT NULL DEFAULT clock_timestamp(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT clock_timestamp(),
    genre VARCHAR(20) NOT NULL CHECK (genre IN ('NOIR', 'THRILLER', 'HORROR', 'FANTASY')),
    author TEXT NOT NULL,
    publication_date DATE NOT NULL,
    title TEXT NOT NULL,
    CONSTRAINT uq_books UNIQUE (author, genre, title)
);