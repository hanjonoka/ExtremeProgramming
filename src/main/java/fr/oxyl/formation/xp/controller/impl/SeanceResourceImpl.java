package fr.oxyl.formation.xp.controller.impl;


import fr.oxyl.formation.xp.controller.SeanceResource;
import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.form.ReservationForm;
import fr.oxyl.formation.xp.service.ReservationService;
import fr.oxyl.formation.xp.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seance")
public class SeanceResourceImpl implements SeanceResource {

    @Autowired
    SeanceService seanceService;
    @Autowired
    ReservationService reservationService;

    @Override
    @GetMapping("/allFutur")
    public ResponseEntity<List<SeanceDTO>> getAllSeanceFutur() throws ControllerException {
        List<SeanceDTO> seanceDTOS = seanceService.findAllSeanceFutur();
        return ResponseEntity.ok(seanceDTOS);
    }




}
