fun main() {
    val (names, surname) = MutableList(2) { readln() }
    println("${names[0]}. $surname")
}