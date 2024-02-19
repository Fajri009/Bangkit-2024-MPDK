package `Kotlin Fundamental`

fun main() {
    // indexing
    val text = "Dicoding"
    val firstChar = text[3]

    println("The 4th character of the $text is $firstChar")

    // for-loop
    val textLoop = "Kotlin"
    for (char in textLoop) {
        print("$char ")
    }

    println()

    // Escaped String
    val statement = "Kotlin is \"Awesome!\""
//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    // Unicode
    val name = "Unicode test: \u00A9"
    println(name)

    // Raw String
    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4"
    println(line)

    val lineSimple = """
        Line 1 
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(lineSimple)
}