package fr.oxyl.formation.xp.dao.impl;

import fr.oxyl.formation.xp.dao.FilmDAO;
import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JdbcFilmDAOTest {

    @Autowired
    FilmDAO filmDAO;

    @Test
    void findAll() {
        List<Film> films = filmDAO.findAll();

        assertThat(films).isNotEmpty().hasSize(4);

        //assertThat(films.get(2).getTitre()).isNotEqualTo("Le retour du roi");
    }

}