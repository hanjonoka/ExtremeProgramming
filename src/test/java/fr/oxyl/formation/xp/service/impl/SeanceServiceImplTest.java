package fr.oxyl.formation.xp.service.impl;

import fr.oxyl.formation.xp.dto.SeanceDTO;
import fr.oxyl.formation.xp.service.SeanceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
class SeanceServiceImplTest {

    @Autowired
    private SeanceService seanceService;

    @Test
    void findAllSeanceFutur(){
        List<SeanceDTO> seanceDTOS = seanceService.findAllSeanceFutur();

        assertThat(seanceDTOS).isNotEmpty();

        assertThat(seanceDTOS.get(0).getFilmDTO().getTitre()).isEqualTo("avatar");

        assertThat(seanceDTOS.get(0).getCinemaDTO().getVille()).isEqualTo("Paris");
    }
}