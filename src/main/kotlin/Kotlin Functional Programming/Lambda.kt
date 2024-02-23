package `Kotlin Functional Programming`

fun main() {
    message2()

    val text = "Hello From Fajri"
    printMessage(text)

    val length = messageLength(text)
    println("Message Length $length")

    println()

    // Perulangan dengan Lambda
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index!")
    }
}

// Perbedaan Regular Function dengan Function Lambda
// Regular Function
fun getMessage(name: String): String {
    return "Hello $name"
}

val comparator = object: Runnable {
    override fun run() {
        // TODO:
    }
}

// Function dengan Lambda
val message: (String) -> String = { name: String ->
    "Hello $name"
}

val comparatorLambda = Runnable {
    // TODO:
}

val message2 = {
    println("Hello From Lambda")
}

val printMessage = { message: String ->
    println(message)
}

val messageLength = { message: String ->
    message.length
}

