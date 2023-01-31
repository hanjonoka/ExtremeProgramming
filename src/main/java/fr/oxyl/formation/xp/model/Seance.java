package fr.oxyl.formation.xp.model;

import java.time.LocalDate;

public class Seance {
    private long id;
    private long cinema_id;
    private long film_id;
    private LocalDate date;
    private int nb_places;

    public Seance() {
    }

    public Seance(long id, long cinema_id, long film_id, LocalDate date, int nb_places) {
        this.id = id;
        this.cinema_id = cinema_id;
        this.film_id = film_id;
        this.date = date;
        this.nb_places = nb_places;
    }


    public Seance(long cinema_id, long film_id, LocalDate date, int nb_places) {
        this.cinema_id = cinema_id;
        this.film_id = film_id;
        this.date = date;
        this.nb_places = nb_places;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCinema_id() {
        return cinema_id;
    }

    public void setCinema_id(long cinema_id) {
        this.cinema_id = cinema_id;
    }

    public long getFilm_id() {
        return film_id;
    }

    public void setFilm_id(long film_id) {
        this.film_id = film_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNb_places() {
        return nb_places;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                ", cinema=" + cinema_id +
                ", film=" + film_id +
                ", date=" + date +
                '}';
    }
}
