package net.devfit.petclinic.domain.entity

data class Owners(
  val id: Int?,
  val firstName: String,
  val lastName: String,
  val address: String,
  val city: String,
  val telephone: String
)
