package fr.oxyl.formation.xp.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.oxyl.formation.xp.controller.impl.SeanceResourceImpl;
import fr.oxyl.formation.xp.service.ReservationService;
import fr.oxyl.formation.xp.service.SeanceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SeanceResourceImpl.class)
class SeanceResourceImplTest {

    @MockBean
    private SeanceService seanceService;

    @MockBean
    private ReservationService reservationService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllSeanceFutur() throws Exception {
        MvcResult result = this.mockMvc.perform(MockMvcRequestBuilders.get("/seance/allFutur"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
    }
}
