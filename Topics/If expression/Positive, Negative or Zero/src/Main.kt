fun main() {
    val inputOne = readln().toInt()

    if (inputOne < 0) {
        println("negative")
    } else if (inputOne > 0) {
        println("positive")
    } else if (inputOne == 0) {
        println("zero")
    }
}