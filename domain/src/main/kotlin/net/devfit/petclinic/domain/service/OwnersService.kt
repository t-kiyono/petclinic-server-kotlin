package net.devfit.petclinic.domain.service

import net.devfit.petclinic.domain.entity.Owners
import net.devfit.petclinic.domain.repository.OwnersRepository
import org.springframework.stereotype.Service

@Service
class OwnersService(val ownersRepository: OwnersRepository) {

  fun showOwner(id: Int): Owners {
    return ownersRepository.findById(id)
  }

}
