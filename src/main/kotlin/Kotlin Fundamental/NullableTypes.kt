package `Kotlin Fundamental`

fun main() {
    val text: String? = null

    // jika mengeluarkan outputnya
    if (text != null) {
        println(text.length)
    }

    // menggnakan is atau !is
    var obj: Any = "Dicoding"

    if (obj is String) {
        // Tidak membutuhkan casting secara eksplisit
        print("String length is ${obj.length}")
    }
}