package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.FilmDAO;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcFilmDAO implements FilmDAO {

    @Autowired
    private JdbcTemplate jdbctemplate;

    @Override
    public List<Film> findAll() {
        return jdbctemplate.query("SELECT * FROM Film", (rs, numrow) -> {
            Film film = new Film();
            film.setId(rs.getLong("id"));
            film.setTitre(rs.getString("titre"));
            film.setDuree(rs.getInt("duree"));
            film.setRealisateur(rs.getString("realisateur"));

            return film;
        });
    }
}
