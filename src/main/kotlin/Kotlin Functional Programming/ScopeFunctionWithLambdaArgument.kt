package `Kotlin Functional Programming`

fun main() {
    // let
    // Fungsi ini digunakan untuk mengakses konteks dari sebuah objek dan banyak ditemukan pada objek yang bertipe nullable
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length @$length"
        println(text)
    }

    // run (menangani objek yang bernilai null)
    val messageRun: String? = null
    messageRun?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    // also (sama seperti apply)
    // nilai yang dikembalikan adalah nilai dari konteks objek
    // Fungsi ini baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya
    val textAlso = "Hello Kotlin"
    val resultAlso = textAlso.also {
        println("value length -> ${it.length}")
    }
    println("text -> $resultAlso")
}