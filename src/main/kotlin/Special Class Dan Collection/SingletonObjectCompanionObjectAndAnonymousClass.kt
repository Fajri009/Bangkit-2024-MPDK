package `Special Class Dan Collection`

fun main() {
    // Singleton Object
    CentralLibrary.borrowBookById(21)

    println()

    // Companion Object
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)

    println()

    val name = MyLibrary.LIBRARY_NAME

    println()

    // Anonymous Class
    flyWithWings(object: IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })

    println()

    // Function (SAM) Interface
    // Catatan : cara ini hanya bisa dilakukan pada interface yang hanya memiliki satu fungsi saja
    // Cara ini biasanya digunakan pada aksi ketika tombol ditekan (myButton.setOnClickListener)
    flyWithWingsSAM {
        println("The Bird flying")
    }
}

// Singleton Object
object CentralLibrary {
    fun borrowBookById(id: Int) {
        println("Book with $id has been borrowed")
    }
}

// Companion Object
class Library {
    companion object {
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

class MyLibrary {
    // Const 'val' are only allowed on top level, in named objects, or in companion objects
    // const val LIBRARY_NAME = "Dicoding Library"

    fun totalBook() {
        println("Total book in $LIBRARY_NAME is unlimited")
    }

    companion object {
        const val LIBRARY_NAME = "Dicoding Library"
    }
}

// Anonymous Class
interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

// Function (SAM) Interface
fun interface IFlySAM {
    fun fly()
}

fun flyWithWingsSAM(bird: IFlySAM) {
    bird.fly()
}