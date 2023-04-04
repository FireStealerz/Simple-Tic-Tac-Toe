fun main() {
    val input = readln()
    var alphabet = 'a'
    while(alphabet <= 'z') {
        if (alphabet in input) {
            ++alphabet
            continue
        }
        print(alphabet)
        ++alphabet
    }
}