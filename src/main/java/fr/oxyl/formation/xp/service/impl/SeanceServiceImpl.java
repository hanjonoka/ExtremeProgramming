package fr.oxyl.formation.xp.service.impl;

import fr.oxyl.formation.xp.dao.CinemaDAO;
import fr.oxyl.formation.xp.dao.FilmDAO;
import fr.oxyl.formation.xp.dao.ReservationDAO;
import fr.oxyl.formation.xp.dao.SeanceDAO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.mapper.SeanceMapper;
import fr.oxyl.formation.xp.model.Cinema;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Seance;
import fr.oxyl.formation.xp.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public SeanceDTO findById(long id) throws ServiceException {
        Optional<Seance> opt_seance = seanceDAO.findById(id);
        if(opt_seance.isPresent()) {
            Seance seance = opt_seance.get();
            Optional<Film> opt_film = filmDAO.findById(seance.getFilm_id());
            Optional<Cinema> opt_cinema = cinemaDAO.findById(seance.getCinema_id());
            if(opt_film.isPresent()&&opt_cinema.isPresent()) {
                return SeanceMapper.convertSeanceCinemaFilmToSeanceDTO(seance, opt_cinema.get(), opt_film.get());
            }else {
                throw new ServiceException();
            }
        }else {
            throw new ServiceException();
        }
    }
}
