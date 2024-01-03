package net.devfit.petclinic.domain.service

import net.devfit.petclinic.domain.entity.Owners
import net.devfit.petclinic.domain.repository.OwnersRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class OwnersServiceTest {

    @MockBean
    lateinit var ownersRepository: OwnersRepository

    @Test
    fun test01() {
        whenever(ownersRepository.findById(1)).thenReturn(Owners(
            id = 1,
            firstName = "George",
            lastName = "Franklin",
            address = "110 W. Liberty St.",
            city = "Madison",
            telephone = "6085551023"
        ))
        val owner = ownersRepository.findById(1)
        Assertions.assertEquals(owner.firstName, "George")
    }

}