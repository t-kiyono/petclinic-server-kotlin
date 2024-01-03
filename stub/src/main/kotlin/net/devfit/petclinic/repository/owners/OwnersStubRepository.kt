package net.devfit.petclinic.repository.owners

import net.devfit.petclinic.domain.entity.Owners
import net.devfit.petclinic.domain.repository.OwnersRepository
import org.springframework.stereotype.Repository

@Repository
class OwnersStubRepository: OwnersRepository {
    override fun findById(id: Int): Owners {
        return Owners(
            id = 1,
            firstName = "George",
            lastName = "Franklin",
            address = "110 W. Liberty St.",
            city = "Madison",
            telephone = "6085551023"
        )
    }
}