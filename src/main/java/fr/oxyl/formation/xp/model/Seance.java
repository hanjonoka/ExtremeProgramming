package fr.oxyl.formation.xp.model;

import java.time.LocalDate;

public class Seance {
    private long id;
    private String cinema;
    private String film;
    private LocalDate date;
    private int nb_places;

    public Seance() {
    }

    public Seance(long id, String cinema, String film, LocalDate date, int nb_places) {
        this.id = id;
        this.cinema = cinema;
        this.film = film;
        this.date = date;
        this.nb_places = nb_places;
    }


    public Seance(String cinema, String film, LocalDate date, int nb_places) {
        this.cinema = cinema;
        this.film = film;
        this.date = date;
        this.nb_places = nb_places;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
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
                ", cinema=" + cinema +
                ", film=" + film +
                ", date=" + date +
                '}';
    }
}
