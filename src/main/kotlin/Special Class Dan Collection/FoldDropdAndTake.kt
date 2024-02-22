package `Special Class Dan Collection`

fun main() {
    val numbers = listOf(1, 2, 3)

    // fold()
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")

    // foldRight()
    val foldRight = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("Fold result: $foldRight")

    // drop()
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    val dropLast = number.dropLast(3)
    println("drop = $drop")
    println("dropLast = $dropLast")

    // take() (menyaring item yang berada di dalam sebuah objek collection
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println("take = $take")

    // takeLast()
    val takeLast = total.takeLast(3)

    print("takeLast = $takeLast")
}