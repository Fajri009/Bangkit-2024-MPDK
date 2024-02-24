package `Berkenalan Dengan Coroutines`

import kotlinx.coroutines.*

fun main() = runBlocking {
    // menggunakan launch():
    val launch = launch {
        // Do background task here
    }

    // menggunakan Job():
    val job = Job()

    // job tanpa langsung menjalankannya
    val job2 = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    // menjalankan job
    // start() akan memulai job tanpa harus menunggu job tersebut selesai
    job2.start()
    println("Other task")
    // Output :
    // Other task
    // Start new job!

    // atau bisa menggunakan join()
    // join() akan menunda eksekusi sampai job selesai
    job2.join()
    println("Other task")
    // Output :
    // Start new job!
    // Other task
}