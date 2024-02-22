package `Special Class Dan Collection`

fun main() {
    // slice() (menyaring item dari posisi tertentu)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    println(slice)

    val sliceStep = total.slice(3..6 step 2)
    println(sliceStep)

    val index = listOf(2, 3, 5, 8)
    val sliceIndex = total.slice(index)
    println(sliceIndex)

    // distinct()
    val totalDistinct = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDistinct.distinct()
    println(distinct)

    // implementasi pada data class
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    // menyaring item yang memiliki panjang sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctText = text.distinctBy {
        it.length
    }
    println(distinctText)

    // Chunked (memecah nilai string menjadi beberapa bagian kecil dalam bentuk array)
    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)

    // diubah menjadi huruf kecil
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    print(chunkedTransform)
}

data class Item(val key: String, val value: Any)