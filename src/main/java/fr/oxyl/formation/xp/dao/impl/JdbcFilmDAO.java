package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.FilmDAO;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Film> findById(long id) {
        try {
            Film film = jdbctemplate.queryForObject("SELECT * FROM Film WHERE id=?", (rs, rownum) -> {
                Film s = new Film(
                        rs.getLong("id"),
                        rs.getString("titre"),
                        rs.getInt("duree"),
                        rs.getString("realisateur")
                );
                return s;
            }, id);
            return Optional.of(film);
        }catch(EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
