package fr.oxyl.formation.xp.controller;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
public interface SeanceRessource {
    ResponseEntity<List<SeanceDTO>> getAllSeanceFutur() throws ControllerException;
}
