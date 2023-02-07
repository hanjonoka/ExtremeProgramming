package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.CinemaDAO;
import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.model.Cinema;
import fr.oxyl.formation.xp.model.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcCinemaDAOTest {

    @Autowired
    CinemaDAO cinemaDAO;

    @Test
    void findAll() {
        List<Cinema> cinemas = cinemaDAO.findAll();

        assertThat(cinemas).isNotEmpty().hasSize(3);
        assertThat(cinemas.get(0).getVille()).isEqualTo("Paris");
    }
}