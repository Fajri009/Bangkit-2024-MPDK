package `Kotlin Functional Programming`

fun main() {
    // Lambda receiver (this)
    // run, with, apply
    // Kita bisa saja tidak menuliskan atau menghilangkan kata kunci this
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    // Lambda argument (it)
    // let, also
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    // apply dan also akan mengembalikan sebuah context object
    // let, run, dan with akan mengembalikan sebuah hasil berupa lambda

    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
    val personApply = Person("John", 25).apply {
        println("apply: Initializing $name, age $age")
    }

    // also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
    val personAlso = Person("Jane", 30).also {
        println("also: Initializing ${it.name}, age ${it.age}")
    }

    // let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
    val personLet = Person("Bob", 22).let {
        println("let: Initializing ${it.name}, age ${it.age}")
        "Result: ${it.name} is ${it.age} years old" // return value
    }
    println("let result: $personLet")

    // run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
    val personRun = Person("Alice", 28).run {
        println("run: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
    println("run result: $personRun")

    // with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
    val personWithResult = with(Person("Charlie", 35)) {
        println("with: Initializing $name, age $age")
        "Result: $name is $age years old" // return value
    }
}

class Person(var name: String, var age: Int)