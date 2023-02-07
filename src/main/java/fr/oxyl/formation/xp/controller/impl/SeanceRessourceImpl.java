package fr.oxyl.formation.xp.controller.impl;


import fr.oxyl.formation.xp.controller.SeanceRessource;
import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import fr.oxyl.formation.xp.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seance")
public class SeanceRessourceImpl implements SeanceRessource {

    @Autowired
    SeanceService seanceService;

    @Override
    @GetMapping("/allFutur")
    public ResponseEntity<List<SeanceDTO>> getAllSeanceFutur() throws ControllerException {
        List<SeanceDTO> seanceDTOS = seanceService.findAllSeanceFutur();
        return ResponseEntity.ok(seanceDTOS);
    }
}
