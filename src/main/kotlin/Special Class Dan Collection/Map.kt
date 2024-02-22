package `Special Class Dan Collection`

fun main() {
    // (key, value)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println()

    // Menampilkan semua key-nya
    println(capital.keys)
    // Menampilkan semua value-nya
    println(capital.values)

    println()

    // MutableMap
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}