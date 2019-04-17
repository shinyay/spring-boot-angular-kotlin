package io.pivotal.shinyay

import io.pivotal.shinyay.entity.UserEntity
import io.pivotal.shinyay.repository.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringBootAngularApplication {

	@Bean
	fun init(userRepository: UserRepository) = CommandLineRunner {
		arrayOf("A-san", "B-san", "C-san", "D-san", "E-san").forEach { name ->
			userRepository.save(UserEntity(name, "$name@pivotal.io"))
		}
	}
}

fun main(args: Array<String>) {
	runApplication<SpringBootAngularApplication>(*args)
}



