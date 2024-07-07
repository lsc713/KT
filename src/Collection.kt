import java.util.LinkedList

fun main() {
    val currencyList = listOf("dollar", "end")


    val mutableCurrencyList = mutableListOf<String>().apply{
        add("dollar")
        add("end")
    }
    val numberSet = setOf(1, 2, 3, 4)
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
    }

    val numberMap = mapOf("one" to 1, "two" to 2)
    val mutableMap = mutableMapOf<String, Int>()
    mutableMap["one"] = 1
    mutableMap["two"] = 2
    /**
     * mutableList를
     ImmutableList로 반환*/
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
    }

    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        add(2)
        addLast(3)
    }

    val arraylist = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
    println("-----------------------")

    for (currency in currencyList) {
        println(currency)
    }

    currencyList.forEach {
        println(it)
    }

    val lowerList = listOf("a","b","c")
//    val upperList = mutableListOf<String>()
//    for (lower in lowerList) {
//        upperList.add(lower.uppercase())
//    }

    val upperList = lowerList.map { it.uppercase() }
    println(upperList)

//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList)
//        if (upperCase in upperList) {
//            if (upperCase == "A" || upperCase == "C") {
//                filteredList.add(upperCase)
//            }
//        }
    val filteredList = upperList
        .asSequence()
        .filter { it == "A" || it == "C" }
        .toList()
    println(filteredList)
}