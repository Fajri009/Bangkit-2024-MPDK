package OOP

fun main() {
    10.printInt()
    println(10.plusThree())
    println(10.slice)
    println(5 sum 3)
}

// Extension Functions
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

// Extension Properties
val Int.slice: Int
    get() = this / 2

// Infix Function
infix fun Int.sum(value: Int): Int {
    return this + value
}