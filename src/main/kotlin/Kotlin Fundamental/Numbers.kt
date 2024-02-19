package `Kotlin Fundamental`

fun main() {
    // Int (32 bit)
    val intNumber = 100

    // Long (64 bit)
    val longNumber: Long = 100
    val longNumber2 = 100L

    // Short (16 bit)
    val shortNumber: Short = 10

    // Byte (8 bit)
    val byteNumber = 0b11010010

    // Double (64 bit) bisa untuk desimal
    val doubleNumber: Double = 1.3

    // Float (32 bit) sama seperti double tapi hanya bisa dibaca sampai 6 - 7 angka
    val floatNumber: Float = 0.123456789f // yang terbaca hanya 0.1234567

    // Untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    // Aritmatika
    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)

    // Operasi pembagian
    println(numberOne / numberTwo)

    // Operasi prioritas
    println(5 + 4 * 4)

    // Konversi
    val byteNumber2: Byte = 10
    val intNumber2: Int = byteNumber2.toInt()

//    toByte(): Byte
//    toShort(): Short
//    toInt(): Int
//    toLong(): Long
//    toFloat(): Float
//    toDouble(): Double
//    toChar(): Char

    // Contoh lain penggunaan konversi
    val stringNumber = "23"
    val intNumber3 = 3

    println(intNumber3 + stringNumber.toInt())

    // Menuliskan nilai numerik yang "readable"
    val readableNumber = 1_000_000
    print(readableNumber)
}