fun main() {
    val (string1, operator, string2) = Array(3) { readln() }
    when (operator) {
        "equals" -> println(string1 == string2)
        "plus" -> println(string1 + string2)
        "endsWith" -> println(string1.endsWith(string2))
        else -> println("Unknown operation")
    }
}