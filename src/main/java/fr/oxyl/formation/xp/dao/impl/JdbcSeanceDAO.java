package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcSeanceDAO implements SeanceDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Override
    public List<Seance> findAll() {
        return jdbcTemplate.query("SELECT * FROM Seance", (rs, numrow) -> {
            Seance seance = new Seance();
            seance.setId(rs.getInt("id"));
            seance.setCinema(rs.getString("cinema"));
            seance.setFilm(rs.getString("film"));
            seance.setDate(rs.getDate("date").toLocalDate());
            return seance;
        });

    }


}
