package fr.oxyl.formation.xp.form;

public class ReservationForm {
    //TODO Annotations contraintes
    private long seance_id;
    private long client_id;
    private int nb_places;

    public ReservationForm(long seance_id, long client_id, int nb_places) {
        this.seance_id = seance_id;
        this.client_id = client_id;
        this.nb_places = nb_places;
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

    public int getNb_places() {
        return nb_places;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }
}
