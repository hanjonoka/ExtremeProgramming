package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
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
    private final JdbcTemplate jdbctemplate = ConnectionManager.getJdbcTemplate();

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
