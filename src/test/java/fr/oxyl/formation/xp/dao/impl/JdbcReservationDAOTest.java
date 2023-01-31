package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.model.Seance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class JdbcReservationDAOTest {

    @Test
    void findAll() {
        ReservationDAO reservationDAO = new JdbcReservationDAO();
        List<Reservation> reservations = reservationDAO.findAll();

        assertThat(reservations).isNotEmpty().hasSize(1);
    }
}