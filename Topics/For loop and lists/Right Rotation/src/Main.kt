fun main() {
    val inputSize = readln().toInt()
    val input: MutableList<Int> = mutableListOf()
    repeat(inputSize) { input.add(readln().toInt()) }
    val rotations = readln().toInt()
    var finalRotations = rotations
    if (rotations > inputSize) {
        finalRotations = rotations % inputSize
    }
    for (i in 1..finalRotations) {
        val temp = input[input.size - 1]
        for (j in input.lastIndex downTo 1) {
            input[j] = input[j - 1]
        }
        input[0] = temp
    }
    println(input.joinToString(separator = " "))
}