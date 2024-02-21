package OOP

fun main() {
    val dicodingCat = CatInheritances("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}

open class AnimalInheritances(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur !")
    }
}

class CatInheritances(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val nmberOfFeet: Int
): AnimalInheritances(pName, pWeight, pAge, pIsCarnivore) {
    override fun eat() {
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
        super.sleep()
    }

    fun playWithHuman() {
        println("$name bermain dengan Manusia!")
    }
}