package `Special Class Dan Collection`

fun main() {
    // filter() (menyaring)
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter {
        it % 2 == 0
    }
    println("evenList = $evenList")

    // filterNot() (kebalikan dari filter())
    val notEvenList = numberList.filterNot {
        it % 2 == 0
    }
    println("notEvenList = $notEvenList")

    // map() (membuat collection baru sesuai perubahan yang kita lakukan dari collection sebelumnya)
    val multipliedBy5 = numberList.map {
        it * 5
    }
    println("multipliedBy5 = $multipliedBy5")

    // count() (menghitung jumlah item yang ada di dalam collection)
    println(numberList.count())
    println("numberList yang merupakan kelipatan dari 3 = ${numberList.count() {it % 3 == 0}}")
    // ada 3 yang kelipatan 3 yaituu 3, 6, 9

    // find() dan firstOrNull() (mengembalikan nilai ketika kondisi terpenuhi)
    val firstOddNumber = numberList.find {
        it % 2 == 1
    }
    val firstOrNullNumber = numberList.firstOrNull {
        it % 2 == 3
    }

    println("firstOddNumber = $firstOddNumber")
    println("firstOrNullNumber = $firstOrNullNumber")

    // first() dan last() (menyaring item pertama atau terakhir dari sebuah collection)
//    val moreThan10 = numberList.first {
//        it > 10
//    }
//
//    println("moreThan10 = $moreThan10")
    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.

    // sum() (menjumlahkan semua angka)
    val total = numberList.sum()
    println("total = $total")

    // sorted() (mengurutkan item yang ada di dalam collection secara ascending)
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // diurutkan secara descending
    val descendingSort = kotlinChar.sortedDescending()
    print(descendingSort)
}