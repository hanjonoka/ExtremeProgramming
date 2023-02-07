package fr.oxyl.formation.xp.service;

import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ServiceException;

import java.util.List;

public interface SeanceService {
    public List<SeanceDTO> findAllSeanceFutur();
    public SeanceDTO findById(long id) throws ServiceException;
}
