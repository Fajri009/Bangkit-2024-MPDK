package `Kotlin Functional Programming`

fun main() {
    val message = buildStringReceiver {
        append("Hello ")
        append("from ")
        append("lambda")
    }

    println(message)
}

// Tanpa menggunakan DSL
fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

// Menggunakan Lambda with Receiver
fun buildStringReceiver(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}