//data class Tuple(val a: Int, val b: Int)

fun plus(pair: Pair<Int,Int>) = pair.first + pair.second

fun main(){
    val plus = println(plus(Pair(1,3)))
    println(plus)

    val pair = Pair("a", 1)
    val newPair = pair.copy(first = "B")
    println(newPair)

    val toList = newPair.toList()

    val triple = Triple("A","B","C")
    println(triple)
    triple.first
    triple.second
    triple.third
    val newTriple = triple.copy(third = "D")

    val (a,b,c) = newTriple
    println("$a,$b,$c")

    val map = mutableMapOf("lee" to "kim")
    for ((k, v) in map) {
        println("$k is $v")
    }
}