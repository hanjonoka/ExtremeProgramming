package fr.oxyl.formation.xp.dao;

import fr.oxyl.formation.xp.model.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaDAO {
    public List<Cinema> findAll();
    public Optional<Cinema> findById(long id);
}
