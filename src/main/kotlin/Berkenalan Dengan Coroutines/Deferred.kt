package `Berkenalan Dengan Coroutines`

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}

// capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.