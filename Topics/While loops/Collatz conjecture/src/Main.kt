
fun main() {
    val input: MutableList<Int> = mutableListOf(readln().toInt())
    while (input.last() != 1) {
        if (input.last() % 2 == 0) {
            var workable = input.last() / 2
            input.add(workable)
        } else {
            var workable = input.last() * 3 + 1
            input.add(workable)
        }
    }
    println(input.joinToString(separator = " "))
}