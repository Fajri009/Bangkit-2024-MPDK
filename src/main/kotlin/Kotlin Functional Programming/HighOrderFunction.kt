package `Kotlin Functional Programming`

import OOP.name

fun main() {
    printResult(10, sum)
    printResult(10, { value ->
        value + value
    })
    printResult(10) { value ->
        value + value
    }

    println()

    // Sebelum
    printMessageBefore("Dicoding", messageBefore)

    // Sesudah
    printMessageAfter("Dicoding") { name: String ->
        "Hello $name (After)"
    }

    // Inline Function
    printResultInline(10) { value ->
        value + value
    }
    printResultInline(20) { value ->
        value + value
    }
}

var sum: (Int) -> Int = { value -> value + value}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

// Sebelum
val messageBefore = { name: String ->
    "Hello $name (Before)"
}

fun printMessageBefore(name: String, messageBefore: (String) -> String) {
    println(messageBefore(name))
}

// Sesudah
fun printMessageAfter(name: String, messageAfter: (String) -> String) {
    println(messageAfter(name))
}

// Inline Function
inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}