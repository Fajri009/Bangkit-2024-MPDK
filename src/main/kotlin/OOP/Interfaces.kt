package OOP

fun main() {
    val camel = Camel()
    camel.walk()
}

interface IFly {
    val numberOfWings: Int

    fun fly()
}

class Bird(override val numberOfWings: Int): IFly {
    override fun fly() {
        if (numberOfWings > 0) {
            println("Flying with $numberOfWings wings")
        } else {
            println("I'm flying without wings")
        }
    }
}

// Perbedaan Abstract Class dan Interface
abstract class AnimalDiff {
    // default value not allowed
    abstract val age: Int // must be overriden
    // default value allowed
    open val isEating = true // optional to be overriden
    val isRespire = true // can not be overriden
}

interface IWalk {
    //default value not allowed
    val numberOfLeg: Int // must be overriden
    fun walk() // must be overriden
}

interface IDrink {

}

class Camel: AnimalDiff(), IWalk, IDrink {
    override val age: Int = 7 // this property must exist
    override val isEating = true // this property optional
    override val numberOfLeg = 2 // this property must exist
    override fun walk() { // this method must exist
        println("Camel can walk")
    }
}

/* Abstract Class :
* - Bisa berisi default value
* - Setiap member final secara default. Supaya bisa di-override, gunakan keyword abstract (wajib) dan open (opsional)
* - 1 class hanya bisa extend satu abstract class, ditandai dengan ().
* - Digunakan jika tidak tahu implementasi sebagian member. */

/* Interface :
* - Tidak bisa berisi default value.
* - Setiap membernya abstract secara default dan harus di-override.
* - 1 class bisa implement lebih dari satu interface.
* - Digunakan jika tidak tahu implementasi keseluruhan member. */