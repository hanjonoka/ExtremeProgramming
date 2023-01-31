package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class JdbcReservationDAO implements ReservationDAO {
    @Autowired
    private JdbcTemplate jdbctemplate;
    public JdbcReservationDAO() {};
    @Override
    public List<Reservation> findAll() {
            return jdbctemplate.query("SELECT * FROM Reservation", (rs, numrow) -> {
                Reservation reservation = new Reservation();
                reservation.setId(rs.getLong("id"));
                reservation.setClient_id(rs.getLong("client_id"));
                reservation.setSeance_id(rs.getLong("seance_id"));
                reservation.setNb_places_reservation(rs.getInt("nb_places_reservation"));

                return reservation;
            });
    }

    @Override
    public List<Reservation> findBySeance(long seance_id) {
        return jdbctemplate.query("SELECT * FROM Reservation WHERE seance_id=?", (rs, numrow) -> {
            Reservation reservation = new Reservation(
                    rs.getLong("id"),
                    rs.getLong("seance_id"),
                    rs.getLong("client_id"),
                    rs.getInt("nb_places_reservation")
            );
            return reservation;
        }, seance_id);
    }

    @Override
    public int getNbPlacesReserveesBySeance(long seance_id) {
        try {
            return jdbctemplate.queryForObject("SELECT SUM(nb_places_reservation) AS nb_places_reservees FROM Reservation WHERE seance_id=? GROUP BY seance_id", (rs, numrow) -> {
                return rs.getInt("nb_places_reservees");
            }, seance_id);
        }catch (EmptyResultDataAccessException e) {
            return 0;
        }
    }

    @Override
    public Reservation createReservation(Reservation r) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        PreparedStatementCreator creator = conn -> {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Reservation(client_id, seance_id, nb_places_reservation) VALUES(?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1,r.getClient_id());
            statement.setLong(2, r.getSeance_id());
            statement.setInt(3, r.getNb_places_reservation());
            return statement;
        };
        jdbctemplate.update(creator,keyHolder);
        r.setId(keyHolder.getKey().longValue());
        return r;
    }


}
