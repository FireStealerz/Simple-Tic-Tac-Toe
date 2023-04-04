

fun main() {

    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }

    println(mutList.indexOf(mutList.maxOrNull()))
}