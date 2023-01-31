package fr.oxyl.formation.xp.dao;

import fr.oxyl.formation.xp.model.Reservation;

import java.util.List;

public interface ReservationDAO {
    public List<Reservation> findAll();
}
