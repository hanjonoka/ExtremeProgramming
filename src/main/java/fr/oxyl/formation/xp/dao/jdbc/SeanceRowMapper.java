package fr.oxyl.formation.xp.dao.jdbc;

import fr.oxyl.formation.xp.model.Seance;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class SeanceRowMapper implements RowMapper<Seance> {
  @Override
  public Seance mapRow(ResultSet rs, int rowNum) throws SQLException {
    Seance seance = new Seance();
    seance.setId(rs.getLong("id"));
    seance.setCinema_id(rs.getLong("cinema_id"));
    seance.setFilm_id(rs.getLong("film_id"));
    seance.setDate(rs.getDate("date_seance").toLocalDate());
    seance.setNb_places(rs.getInt("nb_places"));
    return seance;
  }
}
