package com.patrykserek.android_playground_template.data.api.model

import com.squareup.moshi.Json

data class ResponseInfo(
    @Json(name = "count") val count: Int,
    @Json(name = "pages") val pages: Int,
    @Json(name = "next") val next: String?,
    @Json(name = "prev") val prev: String?,
)
