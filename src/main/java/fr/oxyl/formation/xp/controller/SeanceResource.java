package fr.oxyl.formation.xp.controller;
import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import fr.oxyl.formation.xp.form.ReservationForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import javax.validation.Valid;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
public interface SeanceResource {
    ResponseEntity<List<SeanceDTO>> getAllSeanceFutur() throws ControllerException;
    ResponseEntity<SeanceDTO> getById(long id) throws ControllerException;
}
