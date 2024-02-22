package `Special Class Dan Collection`

fun main() {
    val result: ResultSealed = ResultSealed.Error("Oops!")
    when (result) {
        // jika salah satu kondisi dihapus, kode akan error
        is ResultSealed.Success -> {
            println("Success: ${result.data}")
        }
        is ResultSealed.Error -> {
            println("Error: ${result.message}")
        }
        is ResultSealed.Loading -> {
            println("Loading...")
        }
    }
}

// Contoh pada Enum
enum class ResultEnum {
    SUCCESS, ERROR, LOADING
}

// Contoh pada Sealed
sealed class ResultSealed {
    data class Success(val data: Any): ResultSealed()
    data class Error(val message: String): ResultSealed()
    object Loading: ResultSealed()
}