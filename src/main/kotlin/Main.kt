
fun main() {
    println("Введите целое число n:")
    val n = readLine()?.toIntOrNull()

    println("Введите основание степени x:")
    val x = readLine()?.toIntOrNull()

    if (n != null && x != null) {
        val y = calculateExponent(n, x)
        if (y != null) {
            println("Целочисленный показатель степени y = $y")
        } else {
            println("Целочисленный показатель не существует")
        }
    } else {
        println("Введены некорректные данные")
    }
}

fun calculateExponent(n: Int, x: Int): Int? {
    var y = 0
    var result = 1

    while (result < n) {
        y++
        result *= x
    }

    return if (result == n) y else null
}
