package `Kotlin Functional Programming`

fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }
    printMessage()
}

// Contoh lebih rumitnya
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    if (valueC == 0) {
        throw IllegalArgumentException("valueA must be better than 0")
    }

    return valueA + valueB + valueC
}

// Contoh implementasinya
fun sumImp(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("valueA must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}