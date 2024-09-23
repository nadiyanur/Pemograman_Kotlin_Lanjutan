//Nor nadiya
fun printAll(strings: Collection<String>){
    for (s in strings) print("$s ")
    println()
}

fun main(args: Array<String>) {
    val stringList = listOf("One", "Two", "One")
    printAll(stringList)

    val stringSet = setOf("One", "Two", "Three")
    printAll(stringSet)
}