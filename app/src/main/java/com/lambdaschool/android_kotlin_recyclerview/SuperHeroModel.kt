package com.lambdaschool.android_kotlin_recyclerview


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SuperHero(
    val response: String? = "",
    val id: String? = "",
    val name: String? = "",
    val powerstats: Powerstats?,
    val biography: Biography?,
    val appearance: Appearance?,
    val work: Work?,
    val connections: Connections?,
    val image: Image?
)

@Serializable
data class Base(
    @SerialName("results-for") val results_for: String? = "",
    val results: List<SuperHero>?
)

@Serializable
data class Powerstats(
    val intelligence: String? = "",
    val strength: String? = "",
    val speed: String? = "",
    val durability: String? = "",
    val power: String? = "",
    val combat: String? = ""
)

@Serializable
data class Biography(
    @SerialName("full-name") val full_name: String? = "",
    @SerialName("alter-egos") val alter_egos: String? = "",
    val aliases: List<String>?,
    @SerialName(
        "place-of-birth"
    ) val place_of_birth: String? = "",
    @SerialName(
        "first-appearance"
    ) val first_appearance: String? = "",
    val publisher: String? = "",
    val alignment: String? = ""
)

@Serializable
data class Appearance(
    val gender: String? = "",
    val race: String? = "",
    val height: List<String>?,
    val weight: List<String>?,
    @SerialName("eye-color") val eye_color: String? = "",
    @SerialName("hair-color") val hair_color: String? = ""
)

@Serializable
data class Work(
    val occupation: String? = "",
    val base: String? = ""
)

@Serializable
data class Connections(
    @SerialName("group-affiliation") val group_affiliation: String? = "",
    val relatives: String? = ""
)

@Serializable
data class Image(
    val url: String? = ""
)
