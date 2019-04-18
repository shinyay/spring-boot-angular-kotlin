package io.pivotal.shinyay.controller

import io.pivotal.shinyay.entity.UserEntity
import io.pivotal.shinyay.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:4200"])
class UserController(var userRepository: UserRepository) {

    @GetMapping("/users")
    fun getUsers(): MutableIterable<UserEntity> = userRepository.findAll()

    @PostMapping("/users")
    fun addUser(@RequestBody userEntity: UserEntity) {
        userRepository.save(userEntity)
    }
}
