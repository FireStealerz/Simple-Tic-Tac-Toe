const val FIZZ = 3
const val BUZZ = 5

fun main() {
    val range: IntRange = readln().toInt()..readln().toInt()
    for (i in range)
        if (i % FIZZ == 0 && i % BUZZ == 0) { println("FizzBuzz") }
        else if (i % FIZZ == 0) { println("Fizz") }
        else if (i % BUZZ == 0) { println("Buzz") }
        else println(i)
}