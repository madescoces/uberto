package ar.edu.unsam.phm.uberto.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime


@Entity
data class Vehicle(
    val brand: String,
    val model: String,
    val year: Int,
    val plate: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null

    init {
        validateYear()
    }

    private fun validateYear() {
        // TODO: Parametrizar el año
        if (year < 2010) {
            throw IllegalArgumentException("Year cannot be less than 2010")
        }

        if (year > LocalDateTime.now().year) {
            throw IllegalArgumentException("Year cannot be greater than current year")
        }
    }
}