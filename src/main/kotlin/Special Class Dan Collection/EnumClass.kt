package `Special Class Dan Collection`

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val color: Color2 = Color2.RED
    println(color)

    println()

    // Menampilkan daftar objek enum dan nama dari tiap Enum itu sendiri
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println("$color ")
    }

    println()

    // Menampilkan valuenya
    val colorValue: Color = Color.valueOf("RED")
    println("Color is $colorValue")
    println("Color value is ${colorValue.value.toString(16)}")

    println()

    // Menampilkan posisi tiap objeknya
    println("Position GREEN is ${colorGreen.ordinal}")

    println()

    // Menggunakan When Expression
    when (colorGreen) {
        Color.RED -> print("Color is Red")
        Color.GREEN -> print("Color is Green")
        Color.BLUE -> print("Color is Blue")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

enum class Color2 {
    RED, GREEN, BLUE
}