package ar.edu.unsam.phm.uberto.domain

import jakarta.persistence.*

@Entity
class Calification(
    val score: Int,
    val comment: String? = null
) {
    init {
        validateScore()
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String? = null

    private fun validateScore() {
        if (score < 0) {
            throw IllegalArgumentException("Score cannot be negative")
        }

        if (score > 5) {
            throw IllegalArgumentException("Score cannot be greater than 5")
        }
    }
}