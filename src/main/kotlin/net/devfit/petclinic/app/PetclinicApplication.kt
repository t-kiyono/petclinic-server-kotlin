package net.devfit.petclinic.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = [
	"net.devfit.petclinic.app",
	"net.devfit.petclinic.api",
	"net.devfit.petclinic.domain",
	"net.devfit.petclinic.repository"
])
class PetclinicApplication

fun main(args: Array<String>) {
	runApplication<PetclinicApplication>(*args)
}
