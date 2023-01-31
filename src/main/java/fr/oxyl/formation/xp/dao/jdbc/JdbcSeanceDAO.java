package fr.oxyl.formation.xp.dao.jdbc;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JdbcSeanceDAO implements SeanceDAO {

    private static final String ALL_SEANCES = "SELECT * FROM seance";

    private final JdbcTemplate jdbctemplate;
    private final SeanceRowMapper seanceRowMapper;

    @Autowired
    public JdbcSeanceDAO(JdbcTemplate jdbctemplate, SeanceRowMapper seanceRowMapper) {
        this.jdbctemplate = jdbctemplate;
        this.seanceRowMapper = seanceRowMapper;
    }

    @Override
    public List<Seance> findAll() {
        return jdbctemplate.query(ALL_SEANCES, seanceRowMapper); // TODO for others queries and DAO

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
