package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcSeanceDAOTest {

    @Test
    void findAll() {

        SeanceDAO seanceDAO = new JdbcSeanceDAO();
        List<Seance> seance = seanceDAO.findAll();

        assertThat(seance).isNotEmpty().hasSize(3);

    }
}