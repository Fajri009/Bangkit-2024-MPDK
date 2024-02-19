package `Kotlin Fundamental`

fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

// versi simple
fun setUserSimple(name: String, age: Int) = "Your name is $name, you $age years old"

// Jika kita tidak ingin fungsi yang dibuat mengembalikan nilai, kita bisa menggunakan UNIT sebagai tipe nilai kembaliannya.
fun printUser(name: String) {
    println("Your name is $name")
}