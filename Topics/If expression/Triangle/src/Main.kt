const val SIDES = 3

fun main() {
    val (side1, side2, side3) = Array(SIDES) { readln().toInt() }
    val check1 = side1 + side2 > side3
    val check2 = side2 + side3 > side1
    val check3 = side1 + side3 > side2
    if (check1 && check2 && check3) {
        println("YES")
    } else println("NO")

}