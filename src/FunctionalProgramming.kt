fun main(){
    val func2: () -> String = {""}
    val printHello: () -> Unit = {println("hello")}
    val list = mutableListOf(printHello)
    val func: () -> Unit = list[0]
//    println(func)

    call(func)

    val result = plus(1, 2)
    println(result)

    val list1 = listOf("A", "B", "C")
    val printStr : (String) -> Unit = { println(it)}
    forEachStr(list1, printStr)

    val upperCase: (String) -> String = { it.toUpperCase() }
    val outerFunc = outerFunc()
    outerFunc()

    val callReference = ::printMessage2
    callReference()
}

val printMessage: (String) -> Unit = {message: String -> println(message)}
val printMessage2: (String) -> Unit = {message -> println(message)}
val printMessage3: (String) -> Unit = {println(it)}
val plus : (Int, Int) -> Int = {a,b -> a+b}

fun outerFunc(): () -> Unit = {
        println("function!")
}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

fun call(block: () -> Unit) {
    block()
}