const val INPUT = 3

fun main() {
    val (A, B, H) = IntArray(INPUT) { readln().toInt() }
    if (H in A..B) {
        println("Normal")
    } else if (H < A) {
        println("Deficiency")
    } else if (H > B) {
        println("Excess")
    }

}