package fr.oxyl.formation.xp.service.impl;

import fr.oxyl.formation.xp.dao.CinemaDAO;
import fr.oxyl.formation.xp.dao.FilmDAO;
import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.mapper.SeanceMapper;
import fr.oxyl.formation.xp.model.Cinema;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceServiceImpl implements SeanceService {

    @Autowired
    SeanceDAO seanceDAO;
    @Autowired
    FilmDAO filmDAO;
    @Autowired
    CinemaDAO cinemaDAO;

    @Override
    public List<SeanceDTO> findAllSeanceFutur() {
        List<Seance> seances = seanceDAO.findAllFuture();
        List<Cinema> cinemas = cinemaDAO.findAll();
        List<Film> films = filmDAO.findAll();

        List<SeanceDTO> seanceDTOS = SeanceMapper.convertSeancesCinemasFilmsToSeancesDTO(seances, cinemas, films);
        return seanceDTOS;
    }
}
