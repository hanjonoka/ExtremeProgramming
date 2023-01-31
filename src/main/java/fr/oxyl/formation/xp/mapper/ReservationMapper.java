package fr.oxyl.formation.xp.mapper;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.model.Reservation;

import java.util.List;
import java.util.stream.Collectors;

public class ReservationMapper {
    public static ReservationDTO convertReservationToReservationDTO(Reservation reservation){
        return new ReservationDTO(reservation.getId(), reservation.getClient_id(), reservation.getSeance_id(), reservation.getNb_places_reservation());
    }

    public static List<ReservationDTO> convertResevationsToReservationsDTOs(List<Reservation> reservations) {
        return reservations.stream().map(ReservationMapper::convertReservationToReservationDTO).collect(Collectors.toList());
    }
}
