fun main() {
    val inputNumber: Int = readln().toInt()
    val input = mutableListOf<Int>()
    repeat(inputNumber) {
        input.add(readln().toInt())
    }

    if (input.size == 1) {
        println(input[0])
    } else {
        for (i in 0 until inputNumber - 1) {
            for (j in 0 until inputNumber - 1) {
                if (input[j] > input[j + 1]) {
                    val temp = input[j]
                    input[j] = input[j + 1]
                    input[j + 1] = temp
                }
            }
        }
        println(input.last() * input[input.lastIndex - 1])
    }
}