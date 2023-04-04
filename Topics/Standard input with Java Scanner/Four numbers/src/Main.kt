import java.util.Scanner

const val REPEAT = 4

fun main() {
    val scanner = Scanner(System.`in`)
    repeat(REPEAT) { println(scanner.nextInt()) }
}