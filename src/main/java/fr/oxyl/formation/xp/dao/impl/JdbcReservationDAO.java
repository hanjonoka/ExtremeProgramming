package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcReservationDAO {
    private final JdbcTemplate jdbctemplate = ConnectionManager.getJdbcTemplate();

    @Override
    public List<Reservation> findAll() {
        return jdbctemplate.query("SELECT * FROM Reservation", (rs, numrow) -> {
            Reservation reservation = new Reservation();
            reservation.setId(rs.getLong("id"));
            reservation.setSeance_id(rs.getLong("seance_id"));
            reservation.setClient_id(rs.getLong("client_id"));
            reservation.setNb_places_reservation(rs.getInt("nb_places_reservation"));
            return reservation;
        });

    }




}
