package oop_133486_Tjho_Rionaldinko.week01

import kotlin.math.PI

fun main(args: Array<String>) {
    var radius: Double = 7.0
    var pi: Double = 3.14
    var area: Double = pi * radius * radius

    println("Radius: " + radius + ", Area: " + area)
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}