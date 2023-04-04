import java.util.InputMismatchException

fun main() {
    yesOrno()
}

fun yesOrno(): Unit{
    when (readln()) {
        "1" -> return println("No!")
        "2" -> return println("Yes!")
        "3" -> return println("No!")
        "4" -> return println("No!")
        else -> return println("Unknown number")
    }
}