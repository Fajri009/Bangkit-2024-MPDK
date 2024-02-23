package `Kotlin Functional Programming`

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum?.invoke(10, 10)
    val multipyResult = multiply!!(20, 20)

    println(sumResult)
    print(multipyResult)
}

typealias Arithmetic = ((Int, Int) -> Int)?