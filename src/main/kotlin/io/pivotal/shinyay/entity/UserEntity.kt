package io.pivotal.shinyay.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UserEntity(
        val name: String,
        val email: String,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1)
