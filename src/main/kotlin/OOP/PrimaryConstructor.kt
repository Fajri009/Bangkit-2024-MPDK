package OOP

fun main() {
    val dicodingCat = AnimalPrimary("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingInit = AnimalInit("Dicoding Miaw", -1.5, 2, true)
    println("Nama: ${dicodingInit.name}, Berat: ${dicodingInit.weight}, Umur: ${dicodingInit.age}, mamalia: ${dicodingInit.isMammal}")
}

class AnimalPrimary(
    val name: String,
    val weight: Double,
    val age: Int = 0,
    val isMammal: Boolean
)

class AnimalInit(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsMammal: Boolean
) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight =
            if (pWeight < 0) {
                0.1
            } else {
                pWeight
            }
        age =
            if (pAge < 0) {
                0
            } else {
                pAge
            }
        name = pName
        isMammal = pIsMammal
    }
}