package OOP

// Lateinit (harus menggunakan var)
lateinit var name: String

// Lazy Property (harus menggunakan val)
val nameLazy: String by lazy {
    "Dicoding Miaw"
}

fun main() {
    name = "Dicoding Miaw"
    if (::name.isInitialized) {
        println(name.length)
    } else {
        println("Not Initialized")
    }
}