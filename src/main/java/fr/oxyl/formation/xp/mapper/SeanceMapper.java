package fr.oxyl.formation.xp.mapper;

import fr.oxyl.formation.xp.dto.CinemaDTO;
import fr.oxyl.formation.xp.dto.FilmDTO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.model.Cinema;
import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Seance;

import java.util.List;
import java.util.stream.Collectors;

public class SeanceMapper {
    public static SeanceDTO convertSeanceToSeanceDTO(Seance seance) {
        return new SeanceDTO(seance.getId(), seance.getCinema_id(), seance.getFilm_id(), seance.getDate(), seance.getNb_places());
    }
    public static List<SeanceDTO> convertSeancesCinemasFilmsToSeancesDTO(
            List<Seance> seances, List<Cinema> cinemas, List<Film> films) {
        List<SeanceDTO> seanceDTOS = seances.stream().map(SeanceMapper::convertSeanceToSeanceDTO).collect(Collectors.toList());
        for (SeanceDTO seanceDTO : seanceDTOS) {
            for (Cinema cinema : cinemas) {
                if (cinema.getId()==seanceDTO.getCinema_id()){
                    seanceDTO.setCinemaDTO(new CinemaDTO(cinema.getId(), cinema.getNom(), cinema.getVille()));
                }
            }
            for (Film film : films) {
                if (film.getId()==seanceDTO.getFilm_id()) {
                    seanceDTO.setFilmDTO(new FilmDTO(film.getId(), film.getTitre(), film.getDuree(), film.getRealisateur()));
                }
            }
        }
        return seanceDTOS;
    }
}
