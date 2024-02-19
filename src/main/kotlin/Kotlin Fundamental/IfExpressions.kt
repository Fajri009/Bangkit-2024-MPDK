package `Kotlin Fundamental`

fun main() {
    val openHours = 7
    val now = 20

    // contoh simple
    if (now > openHours) {
        println("office already open")
    }

    // penerapan menggembalikan nilai dan branch else
    var office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }
    println(office)

    // menguji lebih dari 2 kondisi
    office =
        if (now > 7) {
            "Office already open"
        } else if (now == openHours) {
            "Wait a minute, office will be open"
        } else {
            "Office is closed"
        }
    print(office)
}