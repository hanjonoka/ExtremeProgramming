package fr.oxyl.formation.xp.service;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.dto.SeanceDTO;

import java.util.List;

public interface SeanceService {
    public List<SeanceDTO> findAllSeanceFutur();
}