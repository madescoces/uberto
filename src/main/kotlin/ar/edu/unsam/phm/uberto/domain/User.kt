package ar.edu.unsam.phm.uberto.domain

import java.util.*

open class User(
    val name: String? = null,
    val surname: String? = null,
    val bornDate: Date? = null,
    var phone: Number? = null,
    var balance: Double = 0.0
) {
    init {
        validateBalance()
    }

    private fun validateBalance() {
        if (balance < 0.0) {
            throw IllegalArgumentException("Balance cannot be negative")
        }
    }
}

class Driver(
    val vehicle: Vehicle,
    var basePrice: Double = 0.0,
) : User()