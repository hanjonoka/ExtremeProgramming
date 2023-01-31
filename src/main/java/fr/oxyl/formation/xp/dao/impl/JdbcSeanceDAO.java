package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.persistence.ConnectionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcSeanceDAO implements SeanceDAO {

    private final JdbcTemplate jdbctemplate = ConnectionManager.getJdbcTemplate();

    @Override
    public List<Seance> findAll() {
        return jdbctemplate.query("SELECT * FROM seance", (rs, numrow) -> {
            Seance seance = new Seance();
            seance.setId(rs.getLong("id"));
            seance.setCinema(rs.getString("cinema"));
            seance.setFilm(rs.getString("film"));
            seance.setDate(rs.getDate("date").toLocalDate());
            seance.setNb_places(rs.getInt("nb_places"));
            return seance;
        });

    }


}
