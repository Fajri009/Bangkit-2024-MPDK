package `Special Class Dan Collection`

fun main() {
    // List (tidak dapat diubah)
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')

    val anyList = listOf('a', "Kotlin", 3, true)
    println(anyList)
    println(anyList[3])

    // MutableList (dapat diubah)
    val anyListMutable = mutableListOf('a', "Kotlin", 3, true)
    anyListMutable.add('d') // menambah item di akhir list
    anyListMutable.add(1, "love") // menambah item pada indeks ke-1
    anyListMutable[3] = false // mengubah nilai item pada indeks ke-3
    anyListMutable.removeAt(0) // menghapus item pada indeks ke-0

    // Perbedaan Array dan List
    val array = arrayOf("Kotlin", "Java")
    array[0] = "Dart" // no error
//    array.add("JavaScript") // error

    val list = listOf("Kotlin", "Java")
//    list[0] = "Dart" // error
//    list.add("JavaScript") // error

    val mutableList = mutableListOf("Kotlin", "Java")
    mutableList[0] = "Dart" // no error
    mutableList.add("JavaScript") // no error

    val arrayList = arrayListOf("Kotlin", "Java")
    arrayList[0] = "Dart" // no error
    arrayList.add("JavaScript") // no error
}