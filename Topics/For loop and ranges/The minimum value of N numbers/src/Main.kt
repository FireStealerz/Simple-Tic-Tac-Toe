
fun main() {
    val size = readln().toInt()
    val input = MutableList(size) { readln().toInt() }
    println(input.minOrNull())
}
