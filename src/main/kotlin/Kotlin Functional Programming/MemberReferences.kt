package `Kotlin Functional Programming`

fun main() {
    // Function References
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    // Property References
    println(::messageRef.name)
    println(::messageRef.get())

    ::messageRef.set("Kotlin Academy")
    println(::messageRef.get())
}

val sumMember: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

// Function References
fun isEvenNumber(number: Int) = number % 2 == 0

// Property References
var messageRef = "Kotlin"