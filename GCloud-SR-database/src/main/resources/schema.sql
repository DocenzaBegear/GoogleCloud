CREATE TABLE ludoteca (
    id SERIAL NOT NULL,
    titolo VARCHAR(200),
    genere VARCHAR(220),
    completato BOOLEAN,
    PRIMARY KEY (id)
);