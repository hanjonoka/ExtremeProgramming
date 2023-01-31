package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcSeanceDAO implements SeanceDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    public JdbcSeanceDAO() {};

    @Override
    public List<Seance> findAll() {
        return jdbctemplate.query("SELECT * FROM seance", (rs, numrow) -> {
            Seance seance = new Seance();
            seance.setId(rs.getLong("id"));
            seance.setCinema_id(rs.getLong("cinema_id"));
            seance.setFilm_id(rs.getLong("film_id"));
            seance.setDate(rs.getDate("date_seance").toLocalDate());
            seance.setNb_places(rs.getInt("nb_places"));
            return seance;
        });

    }

    @Override
    public Optional<Seance> findById(long id) {
        try {
            Seance seance = jdbctemplate.queryForObject("SELECT * FROM Seance WHERE id=?", (rs, rownum) -> {
                Seance s = new Seance(
                        rs.getLong("id"),
                        rs.getLong("cinema_id"),
                        rs.getLong("film_id"),
                        rs.getDate("date_seance").toLocalDate(),
                        rs.getInt("nb_places")
                );
                return s;
            }, id);
            return Optional.of(seance);
        }catch(EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }


}
