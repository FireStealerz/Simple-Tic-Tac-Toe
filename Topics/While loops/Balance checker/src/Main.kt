import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val next = scanner.nextInt()
        if (balance - next < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $next.")
            return
        } else {
            balance -= next
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}