package fr.oxyl.formation.xp.dao;

import fr.oxyl.formation.xp.model.Seance;

import java.util.List;
import java.util.Optional;

public interface SeanceDAO {

    public List<Seance> findAll();
    public Optional<Seance> findById(long id);

}
