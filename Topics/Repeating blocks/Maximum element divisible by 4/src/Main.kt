const val DIV_BY = 4

fun main() {
    val iterations = readln().toInt()
    val divby4 = mutableListOf<Int>()
    repeat(iterations) {
        val input = readln().toInt()
        if (input % DIV_BY == 0) {
            divby4.add(input)
        }
    }
    val end = divby4.sort()
    println(divby4.maxOrNull())
}