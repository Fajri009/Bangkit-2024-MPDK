package `Kotlin Generics`

fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice(1..10))
}

public fun <T> List<T>.slice(indices: Iterable<Int>) {
    /* ... */
}