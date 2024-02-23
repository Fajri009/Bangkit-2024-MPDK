package `Kotlin Generics`

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

interface List<T> {
    operator fun get(index: Int): T
}

class LongList: List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T>: List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

// Jika LongList menggunakan tipe data Long, berbeda dengan kelas ArrayList karena menggunakan tipe argumen generic <T>.
// Dengan demikian, kita perlu menentukan tipe argumen saat menggunakan kelas ArrayList