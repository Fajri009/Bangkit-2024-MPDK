package OOP

import kotlin.reflect.KProperty

// Untuk memudahkan developer agar tidak perlu menulis fungsi setter dan getter pada tiap kelas jika kelasnya lebih dari satu

fun main() {
    val animal = AnimalDelegate()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    println()

    val person = PersonDelegate()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    println()

    val hero = HeroDelegate()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    println()

    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}

class DelegateName {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalDelegate {
    var name: Any by DelegateName()
    var weight: Any by DelegateName()
    var age: Any by DelegateName()
}

class PersonDelegate {
    var name: Any by DelegateName()
}

class HeroDelegate {
    var name: Any by DelegateName()
}