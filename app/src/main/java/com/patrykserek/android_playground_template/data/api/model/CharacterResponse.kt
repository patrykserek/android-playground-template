package com.patrykserek.android_playground_template.data.api.model

import com.patrykserek.android_playground_template.domain.model.Character
import com.patrykserek.android_playground_template.domain.model.Gender
import com.patrykserek.android_playground_template.domain.model.Status
import com.squareup.moshi.Json

data class CharacterResponse(
    val info: ResponseInfo,
    val results: List<CharacterApi>,
)

data class CharacterApi(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "status") val status: String,
    @Json(name = "species") val species: String,
    @Json(name = "type") val type: String,
    @Json(name = "gender") val gender: String,
    @Json(name = "image") val imageUrl: String,
    @Json(name = "episode") val episodes: List<String>,
    @Json(name = "url") val ownUrl: String,
    @Json(name = "created") val createdAt: String,
) {

    fun toDomainModel() = Character(
        id = id,
        name = name,
        status = Status.fromString(status),
        species = species,
        type = type.ifEmpty { null },
        gender = Gender.fromString(gender),
        imageUrl = imageUrl,
        episodes = episodes
    )
}
