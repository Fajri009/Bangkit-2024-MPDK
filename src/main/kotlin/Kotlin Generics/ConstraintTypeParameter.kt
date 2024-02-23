package `Kotlin Generics`

fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
//    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds
}

// Dengan begitu kita hanya membatasi tipe argumen Number pada kelas ListNumber
class ListNumber<T: Number>: List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}