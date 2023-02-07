package fr.oxyl.formation.xp.controller;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import fr.oxyl.formation.xp.form.ReservationForm;
import org.springframework.http.ResponseEntity;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

public interface ReservationResource {
    @Transactional
    ResponseEntity<ReservationDTO> reserverSeance(@Valid ReservationForm reservationForm) throws ControllerException;

    ResponseEntity<List<ReservationDTO>> getAllReservations() throws ControllerException;
}
