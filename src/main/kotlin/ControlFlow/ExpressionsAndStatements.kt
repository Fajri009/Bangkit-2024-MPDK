package ControlFlow

fun main() {
    val openOffice = 7
    val now = 8

    // Statement
    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

    // Expression
    val office =
        if (now > openOffice) {
            "Office already open"
        } else {
            "Office close"
        }
    println(office)

    // Di dalam expression, terdapat expression lagi
    println(sum(1, 1 * 4))
    // 1 * 4 merupakan sebuah expression yang ada pada pemanggilan fungsi sum() alias fungsi yang mengembalikan nilai

    // Contoh jika statement dan expression digabung
    val value1 = 10
    val value2 = 10

    print(sum(value1, value2))
    // value1 dan value2 merupakan sebuah statement
    // sedangkan pemanggilan fungsi sum merupakan sebuah expression
}

fun sum(value1: Int, value2: Int) =  value1 + value2