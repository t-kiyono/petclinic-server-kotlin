package net.devfit.petclinic.api.controller

import net.devfit.petclinic.domain.service.OwnersService
import net.devfit.petclinic.openapi.api.OwnersControllerApi
import net.devfit.petclinic.openapi.model.Owner
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller

@Controller
class OwnersController(val ownersService: OwnersService): OwnersControllerApi {
    override fun showOwner(ownerId: Int?): ResponseEntity<Owner> {
        val owner = ownersService.showOwner(ownerId!!)
        return ResponseEntity.ok(Owner(owner.firstName, owner.lastName, owner.address, owner.city, owner.telephone).id(owner.id))
    }
}