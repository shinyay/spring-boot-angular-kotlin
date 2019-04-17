package io.pivotal.shinyay.entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val name: String,
        val email: String)
