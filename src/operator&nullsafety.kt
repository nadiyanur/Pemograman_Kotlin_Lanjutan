//nor nadiya
fun main(args: Array<String>) {
    // Null safety
    // The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2) // Tidak terjadi masalah karena maybeNumber tidak null

    maybeNumber = null
    if (maybeNumber != null) {
        println(maybeNumber * 2) // Hanya mencetak jika maybeNumber tidak null
    } else {
        println("maybeNumber adalah null, tidak bisa dikalikan.")
    }
}

