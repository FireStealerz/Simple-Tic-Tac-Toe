fun main() {
    val input: MutableList<Int> = mutableListOf()
    for (i in 0..2) {
        val a = readln().toInt()
        input.add(a)
    }
    println(
        "${input[0] + input[1] == 20 || input[0] + input[2] == 20 || input[1] + input[2] == 20}"
    )
}