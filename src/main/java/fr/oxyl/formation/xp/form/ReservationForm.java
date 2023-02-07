package fr.oxyl.formation.xp.form;

import javax.validation.constraints.Min;

public class ReservationForm {
    //TODO Annotations contraintes
    @Min(1)
    private long seance_id;
    @Min(1)
    private long client_id;
    @Min(1)
    private int nb_places;

    public ReservationForm(long seance_id, long client_id, int nb_places) {
        this.seance_id = seance_id;
        this.client_id = client_id;
        this.nb_places = nb_places;
    }

    public ReservationForm(){}

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
