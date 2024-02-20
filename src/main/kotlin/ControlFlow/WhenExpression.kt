package ControlFlow

import kotlin.random.Random

fun main() {
    var value = 20

    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // when expression dapat mengembalikan nilai
    value = 7
    var stringOfValue =
        when (value) {
            6 -> "value is 6"
            7 -> "value is 7"
            8 -> "value is 8"
            else -> "value cannot be reached"
        }
    println(stringOfValue)

    // Jika memiliki dua atau lebih baris kode di setiap branch-nya
    stringOfValue =
        when (value) {
            6 -> {
                println("Six")
                "value is 6"
            }
            7 -> {
                println("Seven")
                "value is 7"
            }
            8 -> {
                println("Eight")
                "value is 8"
            }
            else -> {
                println("undefined")
                "value cannot be reached"
            }
        }
    println(stringOfValue)

    // when expression juga bisa digunakan pada sebuah objek yang menggunakan is atau !is
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    // when expression juga bisa digunakan untuk memeriksa nilai yang terdapat pada sebuah Range atau Collection
    value = 27
    val ranges = 10..50

    when (value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }

    // Sejak Kotlin 1.3, kita dapat menangkap subjek dari when expression di dalam sebuah variabel
    val registerNumber =
        when (val regis = getRegisterNumber()) {
            in 1..50 -> 50 * regis
            in 51..100 -> 100 * regis
            else -> regis
        }
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)