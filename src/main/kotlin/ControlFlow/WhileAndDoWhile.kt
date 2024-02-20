package ControlFlow

fun main() {
    // While
    //  Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    // Do While
    // Berbeda dengan While, Do While bersifat Exit Controlled Loop dimana proses perulangan akan langsung dijalankan di awal meskipun jika kondisi yang diberikan tidak terpenuhi
    counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}