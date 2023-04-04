fun main() {
    val input: String = readln()
    print(input.substring(0, input.length - 1).replace(input[0], input.last()))
    print(input.first())
}