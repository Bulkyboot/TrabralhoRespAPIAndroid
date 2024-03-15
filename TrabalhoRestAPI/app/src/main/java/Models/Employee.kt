package Models

import javax.persistence.*

class Employee(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val wwid : Long = 0,
    val email : String = "",
    val firstname : String = "",
    val lastname : String = ""){



}