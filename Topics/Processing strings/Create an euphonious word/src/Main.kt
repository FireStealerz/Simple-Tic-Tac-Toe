fun main() {
    val input = readln().toMutableList()
    val vowels = listOf<Char>('a', 'e', 'i', 'o', 'u', 'y')
    val consonants = listOf<Char>('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v','w', 'x', 'z')
    var countNeeded = 0
    var countVowel = 0
    var countCons = 0
    for (i in input) {
        if (i in vowels) {
            countVowel++
            countCons = 0
        } else if (i in consonants) {
            countCons++
            countVowel = 0
        }
        if (countVowel == 3 || countCons == 3) {
            countNeeded++
            countCons = 1
            countVowel = 1
        }
    }
    println(countNeeded)
}