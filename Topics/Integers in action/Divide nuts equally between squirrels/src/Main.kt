fun main() {
    var (one , two) = Array(2) { readln().toInt()}
    if (two % one == 0) {
        println(two / one)
    } else {
        while (two % one != 0) {
            two--
        }
        println(two / one)
    }
}