package `Kotlin Fundamental`

fun main() {
    val name = "Kotlin"
    println("My name is " + name)

    // versi simple
    println("My name is $name")

    // Int dan Double juga bisa
    val old = 3
    println("My name is $name, im $old years old")

    // expression
    val hour = 7
    print("Office ${
        if (hour > 7)
            "already close"
        else
            "is open"
    }")
}