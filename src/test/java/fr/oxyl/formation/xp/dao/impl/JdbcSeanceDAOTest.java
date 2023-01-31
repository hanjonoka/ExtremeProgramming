package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JdbcSeanceDAOTest {

    @Test
    void findAll() {

        SeanceDAO seanceDAO = new JdbcSeanceDAO();
        List<Seance> seance = seanceDAO.findAll();


    }
}