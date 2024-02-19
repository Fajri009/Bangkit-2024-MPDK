package `Kotlin Fundamental`

fun main() {
    // Operator AND (&&)
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen =
        if (now >= officeOpen && now <= officeClosed) {
            true
        } else {
            false
        }

    println("Office is open : $isOpen")

    // Operator OR (||)
    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose")

    // Operator NOT (!)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}