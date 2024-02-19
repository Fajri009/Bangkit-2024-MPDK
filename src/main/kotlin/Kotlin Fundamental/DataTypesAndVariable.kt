package `Kotlin Fundamental`

fun main() {
    // var nilainnya bisa diubah
    var company: String = "Dicoding"
    company = "Dicoding Academy"

    // val nilainya tidak bisa diubah
    val company2: String = "Dicodig"
//    company2 = "Dicoding Academy" // Val cannot be reassigned

    // pengguaan operator + (String)
    val firstHand = "Dicoding "
    val lastHand = "Academy"
    print(firstHand + lastHand)

    println()

    // pengguaan operator + (Int)
    val valueA: Int = 10
    val valueB: Int = 20
    print(valueA + valueB)
}