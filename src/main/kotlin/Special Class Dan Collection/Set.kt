package `Special Class Dan Collection`

// Set (hanya dapat menyimpan nilai yang unik)

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    // Perbandingan 2 Set tidak mementingkan urutannya
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    println(5 in setA)

    // Union dan Intersect
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    // MutableSet (bisa menambah dan menghapus item tetapi tidak bisa mengubah nilai seperti pada List)
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//    mutableSet[2] = 6 // tidak bisa mengubah mutableSet
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) // menghapus item yang memiliki nilai 1

    // Symmetric Difference
    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

    // merge differences
    print((numbers - numbers2) union (numbers2 - numbers))
    // [one, two, four]
}