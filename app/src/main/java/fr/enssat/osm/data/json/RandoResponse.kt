package fr.enssat.osm.data.json

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RandoResponse(
    val type: String,
    val features: List<Rando>
)