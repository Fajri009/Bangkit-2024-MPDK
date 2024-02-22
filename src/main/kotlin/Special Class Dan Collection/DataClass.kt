package `Special Class Dan Collection`

fun main() {
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    val dataUser = DataUser("nrhomen", 17)
    val dataUser2 = DataUser("nrhomen", 17)
    val dataUser3 = DataUser("dimas", 24)
    // mampu melakukan copy()
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(name = "Fajri", age = 21)

    // Memisahkan isi komponennya
//    val name = dataUser.component1()
//    val age = dataUser.component2()
    val (name, age) = dataUser

    println(user)
    println(dataUser)

    println()

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println()

    // False semua karena ini membandingkan lokasi object bukan kontennya
    println(user.equals(user2))
    println(user.equals(user3))

    println()

    println(dataUser4)
    println(dataUser5)

    println()

    println("My name is $name, I am $age years old")

    println()

    val dataUserBehavior = DataUserBehavior("nrohmen", 23)
    dataUserBehavior.intro()
}

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int)

data class DataUserBehavior(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}