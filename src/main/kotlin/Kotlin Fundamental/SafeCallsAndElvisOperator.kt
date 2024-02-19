package `Kotlin Fundamental`

fun main() {
    // Safe Calls Operator (?.)
    val text: String? = null
    text?.length

    // Elvis Operator (condition ? then : else)
    val textLength = text?.length ?: 7
    // kode diatas sama seperti
    val textLength2 =
        if (text != null)
            text.length
        else
            7

    // Non-null assertion (!!)
    val textLengthNonNull = text!!.length
    // Tidak direkomendasikan karena memaksa sebuah objek menjadi non-null
    // Sehingga, ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException
}