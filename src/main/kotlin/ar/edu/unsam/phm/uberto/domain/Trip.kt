package ar.edu.unsam.phm.uberto.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Trip (
    val origin: String? = null,
    val destination: String? = null,
    val durationInMinutes: Int? = null,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    val suscriptor: User? = null

    @ManyToOne(fetch = FetchType.LAZY)
    val driver: Driver? = null

    @OneToOne(fetch = FetchType.LAZY)
    val calification: Calification? = null

    val passengers: Number? = 0
    var date: LocalDateTime? = null
    val price: Double = 0.0
}