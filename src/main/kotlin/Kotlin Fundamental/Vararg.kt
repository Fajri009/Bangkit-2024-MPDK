package `Kotlin Fundamental`

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    println(getNumberSize())

    // Perbedaan Vararg dengan Array
    // Array
    val numberArray = arrayOf(10, 20, 30, 40)
    setsArray(numberArray)

    // Vararg
    val numberVararg = intArrayOf(10, 20, 30, 40)
    setsVararg(10, 20, 20, *numberVararg, 10)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

fun setsArray(numberArray: Array<Int>): Int {
    return 5
}

fun setsVararg(vararg numberVararg: Int): Int {
    return 5
}