package net.devfit.petclinic.api.controller

import net.devfit.petclinic.domain.entity.Owners
import net.devfit.petclinic.domain.service.OwnersService
import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class OwnersControllerTest {

    @MockBean
    lateinit var ownersService: OwnersService

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun test01() {
        whenever(ownersService.showOwner(1)).thenReturn(Owners(
            id = 1,
            firstName = "George",
            lastName = "Franklin",
            address = "110 W. Liberty St.",
            city = "Madison",
            telephone = "6085551023"
        ))

        mockMvc.perform(
            get("/api/owners/1")
        )
            .andExpect(status().isOk)
    }
}