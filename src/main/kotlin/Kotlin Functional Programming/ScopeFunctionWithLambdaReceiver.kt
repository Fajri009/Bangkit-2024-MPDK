package `Kotlin Functional Programming`

fun main() {
    // run
    // Fungsi ini berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian
    val text = "Hello"
    val resultRun = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("resultRun : $resultRun")

    // with
    // Fungsi ini disarankan untuk mengakses apa yang menjadi anggotanya tanpa harus menyediakan nilai kembalian
    val message = "Hello Kotlin!"
    val resultWith = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    val resultWith2 = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith2)

    // apply
    // Fungsi ini dapat melakukan inisialisasi atau konfigurasi dari receiver-nya
    val builder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(builder.toString())
}