package fr.oxyl.formation.xp.model;

public class Reservation {
    private long id;
    private long seance_id;

    public Reservation(long id, long seance_id, long client_id) {
        this.id = id;
        this.seance_id = seance_id;
        this.client_id = client_id;
    }

    public Reservation(long seance_id, long client_id) {
        this.seance_id = seance_id;
        this.client_id = client_id;
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
}
