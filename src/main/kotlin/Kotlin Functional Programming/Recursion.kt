package `Kotlin Functional Programming`

fun main() {
    println("Factorial 9999 is: ${factorialSimple(9999)}")
    // Exception in thread "main" java.lang.StackOverflowError
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

fun factorialSimple(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorialSimple(n - 1)
    }
}

// Tail Call Recursion
tailrec fun factorialTail(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorialTail(n - 1, newResult)
    }
}