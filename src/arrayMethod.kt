//Nor nadiya
fun main(args: Array<String>) {
    //Array Method
    //Short
    val simpsonA = arrayOf("Homer", "Marge", "Lisa", "Meggie")
    simpsonA.sort()
    for (simpson in simpsonA) {
        print(simpson + ' ')
    }
    print('\n')

    //sorted
    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }

    print('\n')

    //reverse() and reversedArray()
    val simpsonC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonC.sort()
    simpsonC.reverse()
    for (simpson in simpsonC) {
        print(simpson + ' ')
    }
    print('\n')

    //indexOf()
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    }else{
        println("Hey that's not Simpson!")
    }

    val simpsonE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("Simpson Size: "+ simpsonE.size)
    if (!simpsonE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+simpsonE.min())
    println("Max = "+simpsonE.max())
    println("First = "+simpsonE.first())
    println("Last = "+simpsonE.last())
    println(simpsonE.contains("Marge"))


}