// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
fun isVowel(letter: Char): Boolean {
    val vowels: List<Char> = listOf('a', 'e', 'i', 'o', 'u')
    return letter.lowercaseChar() in vowels
}