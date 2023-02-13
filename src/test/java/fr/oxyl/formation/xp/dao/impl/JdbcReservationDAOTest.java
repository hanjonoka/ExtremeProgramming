package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.model.Seance;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class JdbcReservationDAOTest {
    @Autowired
    ReservationDAO reservationDAO;

    @Test
    void findAll() {
        List<Reservation> reservations = reservationDAO.findAll();

        assertThat(reservations).isNotEmpty().hasSize(3);
    }

    @Test
    void findBySeance() {
        List<Reservation> reservations = reservationDAO.findBySeance(1);
        assertThat(reservations).isNotEmpty().hasSize(2);
    }

    @Test
    void getNbPlacesReserveesBySeance() {
        int nb_places = reservationDAO.getNbPlacesReserveesBySeance(1);
        assertThat(nb_places).isEqualTo(6);

        nb_places = reservationDAO.getNbPlacesReserveesBySeance(2);
        assertThat(nb_places).isEqualTo(3);
    }
}