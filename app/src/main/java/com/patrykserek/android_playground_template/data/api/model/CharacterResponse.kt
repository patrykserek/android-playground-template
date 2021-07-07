package com.patrykserek.android_playground_template.data.api.model

import com.squareup.moshi.Json

data class CharacterResponse(
    val info: ResponseInfo,
    val results: List<Character>,
)

data class Character(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val name: String,
    @Json(name = "status") val status: String,
    @Json(name = "species") val species: String,
    @Json(name = "type") val type: String,
    @Json(name = "gender") val gender: String,
    @Json(name = "image") val imageUrl: String,
    @Json(name = "episode") val episodes: List<String>,
    @Json(name = "url") val url: String,
    @Json(name = "created") val createdAt: String,
)
