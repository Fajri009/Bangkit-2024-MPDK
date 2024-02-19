package `Kotlin Fundamental`

fun main() {
    // Contoh simple array
    val array = arrayOf(1, 3, 5, 7)

    // Contoh berbagai jenis tipe data array
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)

//    intArrayOf() : IntArray
//    booleanArrayOf() : BooleanArray
//    charArrayOf() : CharArray
//    longArrayOf() : LongArray
//    shortArrayOf() : ShortArray
//    byteArrayOf() : ByteArray

    // mendapatkan nilai tunggal dari sekumpulan nilai
    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])

    // mengubah nilai tunggal
    intArray[2] = 11
    print(intArray[2])
}