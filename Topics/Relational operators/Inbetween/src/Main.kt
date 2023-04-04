const val ITERATIONS = 3

fun main() {
    val (a, b, c) = IntArray(ITERATIONS) { readln().toInt() }
    println(a in b..c || a in c..b)
}