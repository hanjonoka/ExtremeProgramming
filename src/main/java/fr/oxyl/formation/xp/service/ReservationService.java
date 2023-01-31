package fr.oxyl.formation.xp.service;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.form.ReservationForm;

import java.util.List;

public interface ReservationService {
    public List<ReservationDTO> getAllReservations() throws ServiceException;
    public ReservationDTO addReservation(ReservationForm reservationForm) throws ServiceException;
}
