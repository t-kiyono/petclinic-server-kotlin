package net.devfit.petclinic.domain.repository

import net.devfit.petclinic.domain.entity.Owners

interface OwnersRepository {
  fun findById(id: Int): Owners
}
