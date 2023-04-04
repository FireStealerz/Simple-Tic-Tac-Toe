fun main() {
    val size = readln().toInt()
    val myList = mutableListOf<Int>()
    for (i in 0 until size) {
        myList.add(readln().toInt())
    }
    val numberM = readln().toInt()
    if (myList.contains(numberM)) {
        println("YES")
    } else { println("NO") }
}