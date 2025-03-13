package ar.edu.unsam.phm.uberto.domain

import jakarta.persistence.*

@Entity
class Driver(
    val name: String,
    val surname: String,
    @OneToOne
    val vehicle: Vehicle
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String? = null
    var basePrice: Double = 0.0
}