package fr.oxyl.formation.xp.service.impl;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.form.ReservationForm;
import fr.oxyl.formation.xp.service.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ReservationServiceImplTest {

    @Autowired
    private ReservationService reservationService;
    @Test
    void test_addReservation_and_getAllReservation() throws ServiceException {
        //Testing the add function
        reservationService.addReservation(new ReservationForm(1,1,5));

        //Testing the get function
        List<ReservationDTO> reservationDTOS = reservationService.getAllReservations();
        assertThat(reservationDTOS).isNotEmpty().hasSize(4);
    }
}