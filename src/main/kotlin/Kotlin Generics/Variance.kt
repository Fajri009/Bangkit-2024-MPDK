package `Kotlin Generics`

// Covariant mengizinkan substitusi dengan turunan
// Contravariant mengizinkan substitute dengan superclass

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    // Implementasi Variance
    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}

abstract class Vehicle(wheel: Int)
class Car(speed: Int): Vehicle(4)
class MotorCycle(speed: Int): Vehicle(2)

// Covariant (hanya bisa diproduksi seperti menjadikannya sebagai return type)
interface CovariantList<out E>: Collection<E> {
    operator fun get(index: Int): E
}

open class Binatang
class Kucing: Binatang()

class Kandang<out T: Binatang>(private val hewan: T) {
    fun dapatkanHewan(): T {
        return hewan
    }
}

val kandangKucing: Kandang<Kucing> = Kandang(Kucing())
val kandangBinatang: Kandang<Binatang> = kandangKucing // Covariant, dapat di-substitute

// Contravariant (hanya bisa dikonsumsi dengan menjadikannya sebagai tipe argumen)
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

class PenjagaKandang<in T: Binatang> {
    fun urusKandang(hewan: T) {
        // Melakukan sesuatu dengan kandang yang berisi hewan
    }
}

val penjagaBinatang: PenjagaKandang<Binatang> = PenjagaKandang<Binatang>()
val penjagaKucing: PenjagaKandang<Kucing> = penjagaBinatang // Contravariant, dapat di-substitute