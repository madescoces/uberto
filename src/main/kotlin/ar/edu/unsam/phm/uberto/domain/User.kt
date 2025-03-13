package ar.edu.unsam.phm.uberto.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
class User(
    val name: String,
    val surname: String,
    val bornDate: Date,
    var phone: Number,
) {
    init {
        validateBalance()
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null
    var balance: Double = 0.0

    fun age(): Int = Calendar.getInstance().apply { time = bornDate }.get(Calendar.YEAR) - 1900

    private fun validateBalance() {
        if (balance < 0.0) {
            throw IllegalArgumentException("Balance cannot be negative")
        }
    }
}