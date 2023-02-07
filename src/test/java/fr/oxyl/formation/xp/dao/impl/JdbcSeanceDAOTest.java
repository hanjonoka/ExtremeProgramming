package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Seance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcSeanceDAOTest {

    @Autowired
    SeanceDAO seanceDAO;

    @Test
    void findAll() {
        List<Seance> seance = seanceDAO.findAll();

        assertThat(seance).isNotEmpty().hasSize(3);

    }

    @Test
    void findAllFuture() {
        List<Seance> seancefutures = seanceDAO.findAllFuture();
        assertThat(seancefutures).isNotEmpty(); //.hasSize(1);

    }
}