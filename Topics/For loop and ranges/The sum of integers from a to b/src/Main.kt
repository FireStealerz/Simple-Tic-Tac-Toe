const val REPEAT = 2

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    var sum: Int = 0
    for (i in a until b + 1) {
        sum += i

    }
    println(sum)
}