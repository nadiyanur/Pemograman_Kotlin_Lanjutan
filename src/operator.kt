//nor nadiya
fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    maybeNumber = null
    println(maybeNumber?.times(2) ?: "Nilai maybeNumber adalah null") // Safe call dengan elvis operator

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    println(s2?.length ?: "s2 adalah null") // Safe call dengan elvis operator
}
