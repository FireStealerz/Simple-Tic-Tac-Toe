fun main() {
    val (first, second) = MutableList<String>(2) { readln() }
    println(first == second)
}