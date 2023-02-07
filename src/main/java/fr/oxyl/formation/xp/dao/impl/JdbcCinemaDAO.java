package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.CinemaDAO;
import fr.oxyl.formation.xp.model.Cinema;
import fr.oxyl.formation.xp.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcCinemaDAO implements CinemaDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    public JdbcCinemaDAO() {};

    @Override
    public List<Cinema> findAll() {
        return jdbctemplate.query("SELECT * FROM Cinema", (rs, rownum) -> {
            return new Cinema(
                    rs.getLong("id"),
                    rs.getString("nom"),
                    rs.getString("ville"));
        });
    }

    @Override
    public Optional<Cinema> findById(long id) {
        try {
            Cinema cinema = jdbctemplate.queryForObject("SELECT * FROM Cinema WHERE id=?", (rs, rownum) -> {
                Cinema s = new Cinema(
                        rs.getLong("id"),
                        rs.getString("nom"),
                        rs.getString("ville")
                );
                return s;
            }, id);
            return Optional.of(cinema);
        }catch(EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
