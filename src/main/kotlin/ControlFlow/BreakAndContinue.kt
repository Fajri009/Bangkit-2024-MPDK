package ControlFlow

fun main() {
    // continue (skip)
    val listOfInt = listOf(1, 2, 3, null, 5 , null, 7)

    print("Continue: ")
    for (i in listOfInt) {
        if (i == null) {
            continue
        }
        print(i)
    }

    // break (berhenti)
    print("\nBreak: ")
    print("Continue: ")
    for (i in listOfInt) {
        if (i == null) {
            break
        }
        print(i)
    }

    println()

    // Break and Continue Labels
    // Tujuan menggunakan label untuk menghentikan looping terluar juga
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if (j > 5) break@loop
        }
    }
}