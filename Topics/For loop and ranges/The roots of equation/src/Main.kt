import kotlin.math.pow
const val INF = 0
const val SUP = 1000
const val INPUT = 4
const val FIRST_X = 3
const val SECOND_X = 2
fun main() {
    val (a: Int, b: Int, c: Int, d: Int) = MutableList(INPUT) { readln().toInt() }
    for (x in INF..SUP) {
        if ((a * x.toDouble().pow(FIRST_X) + b * x.toDouble().pow(SECOND_X) + c * x + d).toInt() == 0) { println(x) }
    }
}