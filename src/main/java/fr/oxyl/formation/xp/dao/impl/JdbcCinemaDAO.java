package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.CinemaDAO;
import fr.oxyl.formation.xp.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
