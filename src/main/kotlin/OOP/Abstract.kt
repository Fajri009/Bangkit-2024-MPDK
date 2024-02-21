package OOP

// Berbeda dengan inheritances, abstract tidak harus memiliki implementasi pada method dan propertynya

fun main() {
//    val animal = AnimalAbstract("Dicoding Animal", 2.6, 1, true)
    // Cannot create an instance of an abstract clas
}

abstract class AnimalAbstract(
    var name: String,
    var weight: Double,
    var age: Int,
    var isCarnivore: Boolean
) {
    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}