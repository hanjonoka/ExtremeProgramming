package fr.oxyl.formation.xp.service.impl;

import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.form.ReservationForm;
import fr.oxyl.formation.xp.mapper.ReservationMapper;
import fr.oxyl.formation.xp.model.Reservation;
import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    SeanceDAO seanceDAO;
    @Autowired
    ReservationDAO reservationDAO;

    @Override
    public List<ReservationDTO> getAllReservations() throws ServiceException {
        List<Reservation> reservations = reservationDAO.findAll();
        return ReservationMapper.convertResevationsToReservationsDTOs(reservations);
    }

    @Override
    public ReservationDTO addReservation(ReservationForm reservationForm) throws ServiceException {
        Optional<Seance> opt_seance = seanceDAO.findById(reservationForm.getSeance_id());
        if (!opt_seance.isPresent()) throw new ServiceException("seance inexistante");

        Seance seance = opt_seance.get();
        int nb_places_reservees = reservationDAO.getNbPlacesReserveesBySeance(reservationForm.getSeance_id());
        if(nb_places_reservees + reservationForm.getNb_places() > seance.getNb_places()) throw new ServiceException("Seance pleine");

        Reservation new_reservation = reservationDAO.createReservation(new Reservation(
                reservationForm.getSeance_id(),
                reservationForm.getClient_id(),
                reservationForm.getNb_places()
        ));

        return ReservationMapper.convertReservationToReservationDTO(new_reservation);
    }
}
