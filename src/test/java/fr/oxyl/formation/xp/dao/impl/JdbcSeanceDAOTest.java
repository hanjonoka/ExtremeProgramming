package fr.oxyl.formation.xp.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdbcSeanceDAOTest {

    @Autowired
    private SeanceDAO seanceDAO;

    @Test
    void findAll() {
        List<Seance> seance = seanceDAO.findAll();

        assertThat(seance).isNotEmpty().hasSize(3);

    }
}