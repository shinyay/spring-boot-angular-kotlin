package io.pivotal.shinyay.controller

import io.pivotal.shinyay.entity.UserEntity
import io.pivotal.shinyay.repository.UserRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["http://localhost:4200"])
class UserController(repository: UserRepository) {

    private val userRepository: UserRepository = repository

    @GetMapping("/users")
    fun getUsers(): MutableIterable<UserEntity> = userRepository.findAll()
}
