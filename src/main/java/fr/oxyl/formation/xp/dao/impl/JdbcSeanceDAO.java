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
        return null;
    }


}
