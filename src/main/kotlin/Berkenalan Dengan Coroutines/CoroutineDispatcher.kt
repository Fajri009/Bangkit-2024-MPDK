package `Berkenalan Dengan Coroutines`

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    // Dispatchers.Default
//    launch(Dispatchers.Default) {
//        // TODO: Implement suspending lambda here
//    }

    // Dispatchers.IO
//    launch(Dispatchers.IO) {
//        // TODO: Implement algorithm here
//    }

    // Dispatchers.Unconfined
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
    // Starting in main
    // Resuming in kotlinx.coroutines.DefaultExecutor

    // Single Thread Context
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
    // Starting in myThread
    // Resuming in myThread

    // Thread Pool
    val dispatcherThreadPool = newFixedThreadPoolContext(3, "myPool")
    launch(dispatcherThreadPool) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
    // Starting in myPool-1
    // Resuming in myPool-2
}