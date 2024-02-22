package `Special Class Dan Collection`

fun main() {
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}

class House {
    // Properti outer class
    val buildingArea = 100

    inner class Room {
        val totalRooms = 4
        fun measureRoomArea() {
            println(buildingArea / totalRooms)
        }
    }
}