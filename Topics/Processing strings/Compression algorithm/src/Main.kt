fun main() {
    val input: MutableList<Char> = readln().toMutableList()
    var count = 1
    input.add('/')
    for (i in 1..input.lastIndex) {
        if (input[i] == input[i - 1]) {
            count++
        } else {
            print("${input[i - 1]}$count")
            count = 1
        }
    }
}