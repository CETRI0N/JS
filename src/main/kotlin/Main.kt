fun String.crypt(cryptLett:(Int, Char)->Char): String{
    return this.mapIndexed(cryptLett).joinToString("")
}

fun main() {
    println("Введите слово, которое хотите зашифровать")
    var word:String = readln()
    var exp4 = exponentiation(4)
    word = word.crypt{index, letter -> letter+exp4(index)}
    println("Зашифрованное слово: ${word}")
}

fun exponentiation(num:Int): (Int) -> Int {
    var result = 1
    return {exp ->
        repeat(exp){result*=num}
        result
    }
}