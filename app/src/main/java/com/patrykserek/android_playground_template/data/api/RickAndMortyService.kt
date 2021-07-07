package com.patrykserek.android_playground_template.data.api

import com.patrykserek.android_playground_template.data.api.model.CharacterApi
import com.patrykserek.android_playground_template.data.api.model.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RickAndMortyService {

    @GET("character")
    suspend fun getCharacters(@Query("page") page: Int = 1): CharacterResponse

    @GET("character/{id}")
    suspend fun getCharacterById(@Path("id") vararg id: Int): CharacterApi

}
