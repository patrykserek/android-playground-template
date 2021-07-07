package com.patrykserek.android_playground_template.domain.model

data class Character(
    val id: Int,
    val name: String,
    val status: Status,
    val species: String,
    val type: String?,
    val gender: Gender,
    val imageUrl: String,
    val episodes: List<String>,
)

enum class Status {
    ALIVE, DEAD, UNKNOWN;

    companion object {
        fun fromString(status: String): Status = when (status) {
            "Alive" -> ALIVE
            "Dead" -> DEAD
            else -> UNKNOWN
        }
    }
}

enum class Gender {
    MALE, FEMALE, GENDERLESS, UNKNOWN;

    companion object {
        fun fromString(status: String): Gender = when (status) {
            "Male" -> MALE
            "Female" -> FEMALE
            "Genderless" -> GENDERLESS
            else -> UNKNOWN
        }
    }
}
