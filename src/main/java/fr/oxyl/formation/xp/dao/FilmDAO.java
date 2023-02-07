package fr.oxyl.formation.xp.dao;

import fr.oxyl.formation.xp.model.Film;
import fr.oxyl.formation.xp.model.Seance;

import java.util.List;
import java.util.Optional;

public interface FilmDAO {

    public List<Film> findAll();
    public Optional<Film> findById(long id);

}
