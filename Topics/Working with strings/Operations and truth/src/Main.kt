fun main() {
    val inputOne = readln()
    val inputTwo = readln()
    val inputThree = readln()
    println(check(inputOne, inputTwo,inputThree))
}

fun check(inputOne: String, inputTwo: String, inputThree: String): Boolean {
    return inputOne + inputTwo == inputThree
}

