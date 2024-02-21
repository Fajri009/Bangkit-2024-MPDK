package OOP

fun main() {
    // Private
    val dicodingCat = AnimalPrivate("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

    // Protected
    val catProtected = CatProtected("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${catProtected.name}")
//    println("Berat Kucing: ${catProtected.weight}") // error: expecting a top level declaration
}

class AnimalPrivate(
    private var name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean = true
) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

open class AnimalProtected(val name: String, protected val weight: Double)

class CatProtected(pName: String, pWeight: Double): AnimalProtected(pName, pWeight)

// Internal
internal class AnimalInternal(val name: String)