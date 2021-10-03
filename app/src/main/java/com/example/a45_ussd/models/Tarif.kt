package com.example.a45_ussd.models

import java.io.Serializable

data class Tarif(
    val name: String,
    val daqiqa: Int,
    val internet: Int,
    val sms: Int,
    val cost: Int,
    val about: String
) : Serializable