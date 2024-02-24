package `Berkenalan Dengan Coroutines`

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

// async bisa menjalankan kedua fungsi tersebut berjalan bersamaan dan membutuhkan waktu yang lebih singkat

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital =  async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne vs $timeTwo")
}

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}