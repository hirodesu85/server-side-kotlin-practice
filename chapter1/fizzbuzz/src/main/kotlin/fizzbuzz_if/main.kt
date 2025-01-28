package fizzbuzz_if

//if 式の結果を直接 return を渡したパターン
fun fizzBuzz(i: Int): String {
    return if (i % 15 == 0) {
        "FizzBuzz"
    } else if (i % 3 == 0) {
        "Fizz"
    } else if (i % 5 == 0) {
        "Buzz"
    } else {
        "$i"
    }
}

fun main(args: Array<String>) {
    val n = 20
    for (i in 1..n) {
        println(fizzBuzz(i))
    }
}

