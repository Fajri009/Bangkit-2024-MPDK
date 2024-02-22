package `Special Class Dan Collection`

fun main() {
    val list = (1..10000).toList()
    val number = list.asSequence().filter {
        it % 5 == 0
    }.map {
        it * 2
    }.first()
    println(number)

    val sequenceNumber = generateSequence(1){ it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}