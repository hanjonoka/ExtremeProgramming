package fr.oxyl.formation.xp.model;

import java.time.LocalDate;

public class Seance {
    private long id;
    private String cinema;
    private String film;
    private LocalDate date;

    public Seance() {
    }

    public Seance(long id, String cinema, String film, LocalDate date) {
        this.id = id;
        this.cinema = cinema;
        this.film = film;
        this.date = date;
    }

    public Seance(String cinema, String film, LocalDate date) {
        this.cinema = cinema;
        this.film = film;
        this.date = date;
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
