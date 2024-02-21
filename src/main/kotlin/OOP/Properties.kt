package OOP

fun main() {
    val dicodingCat = AnimalSetterGetter()
    println("Name: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

// versi setter dan getter
class AnimalSetterGetter {
    var name: String = "Dicoding Miaw"
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}