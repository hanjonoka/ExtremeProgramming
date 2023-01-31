package fr.oxyl.formation.xp.model;

public class Reservation {
    private long id;
    private long seance_id;

    private int nb_places_reservation;
    public Reservation(long id, long seance_id, long client_id, int nb_places_reservation) {
        this.id = id;
        this.seance_id = seance_id;
        this.client_id = client_id;
        this.nb_places_reservation = nb_places_reservation;
    }

    public Reservation(long seance_id, long client_id, int nb_places_reservation) {
        this.seance_id = seance_id;
        this.client_id = client_id;
        this.nb_places_reservation = nb_places_reservation;
    }

    public Reservation() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSeance_id() {
        return seance_id;
    }

    public void setSeance_id(long seance_id) {
        this.seance_id = seance_id;
    }

    public long getClient_id() {
        return client_id;
    }

    public void setClient_id(long client_id) {
        this.client_id = client_id;
    }

    private long client_id;

    public int getNb_places_reservation() {
        return nb_places_reservation;
    }

    public void setNb_places_reservation(int nb_places_reservation) {
        this.nb_places_reservation = nb_places_reservation;
    }
}
