CREATE TABLE IF NOT EXISTS Film(id LONG primary key auto_increment, titre VARCHAR(100), duree INT, realisateur VARCHAR(100));
INSERT INTO Film(titre, duree, realisateur) VALUES('avatar', 162, 1);
INSERT INTO Film(titre, duree, realisateur) VALUES('La communauté de l''anneau', 178, 2);
INSERT INTO Film(titre, duree, realisateur) VALUES('Les deux tours', 179, 2);
INSERT INTO Film(titre, duree, realisateur) VALUES('Le retour du roi', 201, 2);

CREATE TABLE IF NOT EXISTS Client(id LONG primary key auto_increment, nom VARCHAR(100), isAdmin BOOLEAN);
INSERT INTO Client(nom, isAdmin) VALUES('Jérémy', FALSE);
INSERT INTO Client(nom , isAdmin) VALUES('Laurent', TRUE);
INSERT INTO Client(nom, isAdmin) VALUES ('Joris', TRUE);

CREATE TABLE IF NOT EXISTS Cinema(id LONG PRIMARY KEY auto_increment, nom VARCHAR(100), ville VARCHAR(100));
INSERT INTO Cinema(nom, ville) VALUES('Pathé', 'Paris');
INSERT INTO Cinema(nom, ville) VALUES ('Terrine', 'Marseille');
INSERT INTO Cinema(nom, ville) VALUES ('Rilette', 'Le Mans');

CREATE TABLE IF NOT EXISTS Seance(id LONG PRIMARY KEY auto_increment, cinema_id LONG, film_id LONG, date_seance DATE, nb_places INT);
INSERT INTO Seance(cinema_id, film_id, date_seance, nb_places) VALUES ( 0, 1, '2023-02-15', 200 );
INSERT INTO Seance(cinema_id, film_id, date_seance, nb_places) VALUES ( 1,3, '2022-02-01', 150 );
INSERT INTO Seance(cinema_id, film_id, date_seance,nb_places) VALUES ( 1, 1, '2022-02-01', 100 );

CREATE TABLE IF NOT EXISTS Reservation(id LONG PRIMARY KEY auto_increment, seance_id LONG, client_id LONG, nb_places_reservation INT);
INSERT INTO Reservation(seance_id, client_id, nb_places_reservation) VALUES ( 0, 0, 2 );
INSERT INTO Reservation(seance_id, client_id, nb_places_reservation) VALUES ( 0, 1, 4 );
INSERT INTO Reservation(seance_id, client_id, nb_places_reservation) VALUES ( 1, 0, 3 );