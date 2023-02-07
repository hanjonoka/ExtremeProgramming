package fr.oxyl.formation.xp.controller.impl;

import fr.oxyl.formation.xp.controller.ReservationResource;
import fr.oxyl.formation.xp.dto.ReservationDTO;
import fr.oxyl.formation.xp.exception.ControllerException;
import fr.oxyl.formation.xp.exception.ServiceException;
import fr.oxyl.formation.xp.form.ReservationForm;
import fr.oxyl.formation.xp.service.ReservationService;
import fr.oxyl.formation.xp.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationResourceImpl implements ReservationResource {
    @Autowired
    SeanceService seanceService;
    @Autowired
    ReservationService reservationService;

    @Override
    @PostMapping("/reserver")
    public ResponseEntity<ReservationDTO> reserverSeance(@RequestBody @Valid ReservationForm reservationForm) throws ControllerException {
        try {
            ReservationDTO r = reservationService.addReservation(reservationForm);
            if(r!=null){
                return ResponseEntity.ok(r);
            }else{
                return ResponseEntity.status(500).build();
            }
        } catch (ServiceException e) {
            e.printStackTrace();
            throw new ControllerException();
        }
    }

    @Override
    @GetMapping("/getAll")
    public ResponseEntity<List<ReservationDTO>> getAllReservations() throws ControllerException {
        try {
            return ResponseEntity.ok(reservationService.getAllReservations());
        }catch (ServiceException e) {
            e.printStackTrace();
            throw new ControllerException();
        }
    }
}
