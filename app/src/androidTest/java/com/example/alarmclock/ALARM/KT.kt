package com.example.alarmclock

data class Alarm(
    val hour: Int,
    val minute: Int,
    var isEnabled: Boolean = true
)

