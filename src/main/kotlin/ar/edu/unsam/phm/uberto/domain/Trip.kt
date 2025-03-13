package ar.edu.unsam.phm.uberto.domain

class Trip (
    val origin: String? = null,
    val destination: String? = null,
    val passengers: List<User>? = null
)