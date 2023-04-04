fun main() {
    val (a, b, c) = Array<Int>(3) { readln().toInt()}
    if (a > 0 && b <= 0 && c <= 0 || a <= 0 && b > 0 && c <= 0 || a <= 0 && b <= 0 && c > 0) println("true")
    else println("false")
}