package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcReservationDAO implements ReservationDAO {
    private final JdbcTemplate jdbctemplate = ConnectionManager.getJdbcTemplate();

    @Override
    public List<Reservation> findAll() {
        return null;
    }

}
