package `Kotlin Fundamental`

fun main() {
    // Named Argument
    val fullName = getFullName(
        first = "Kotlin",
        middle = " is ",
        last = "Awesome"
    )
    println(fullName)

    // Default Argument
    val fullNameDefault = getFullNameDefault()
    println(fullNameDefault)

    // Mengubah nilai
    val fullNameChange = getFullNameDefault(first = "Dicoding")
    print(fullNameChange)
}

// Named Argument
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// Default Argument
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"
): String {
    return "$first $middle $last"
}
