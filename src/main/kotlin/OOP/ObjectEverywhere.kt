package OOP

fun main() {
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

    println()

    val someStringInt = "123"
    val someInt = someStringInt.toInt()
    val someStringDouble = "12.34"
    val someDouble = someStringDouble.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}