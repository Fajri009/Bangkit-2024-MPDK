package ControlFlow

fun main() {
    val ranges = 1..5
    for (i in ranges) {
        println("value is $i!")
    }

    println()

    // Penggunaan step
    val rangesStep = 1.rangeTo(10) step 3
    for (i in rangesStep) {
        println("value is $i!")
    }

    println()

    // Mengakses indeks untuk setiap elemen
    val rangesIndex = 1.rangeTo(10) step 3
    for ((index, value) in rangesIndex.withIndex()) {
        println("value $value with index $index")
    }

    println()

    // forEach
    val rangesForEach = 1.rangeTo(10) step 3
    rangesForEach.forEach { value ->
        println("value is $value")
    }
}