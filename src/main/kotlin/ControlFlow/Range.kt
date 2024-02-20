package ControlFlow

fun main() {
    // Contoh simple (..)
    val rangeInt = 1..10

    // Mengeluarkan output jarak antara dua nilai yang dicakup
    println(rangeInt.step)

    // Untuk mengubah nilai dari step
    val rangeInt2 = rangeInt step 2
    rangeInt2.forEach {
        print("$it ")
    }
    println(rangeInt2.step)

    // rangeTo()
    val rangeToInt = 1.rangeTo(10)
    println(rangeToInt)

    // downTo() = urutan terbalik
    val downToInt = 10.downTo(1)
    println(downToInt)

    // Memeriksa apakah suatu nilai ada pada cakupan nilai Range
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    // Jika kode diatas dikonvert ke IF
    if (1 <= 7 && 7 <= 10) {
        println("Value 7 available")
    }

    // Memeriksa jika nilai tersebut tidak ada pada nilai cakupan nilai Range
    if (11 !in tenToOne) {
        println("No value 11 in Range")
    }

    // Bisa diimplementasikan pada char
    val rangeChar = 'A'.rangeTo('F')
}