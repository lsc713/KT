var x = 5


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) : Unit {
    println("$a + $b = ${a+b}")
}
fun greeting(message: String = "hello") {
    println(message)
}
fun main(){
    val day = 2
    val result = when (day) {
        1 -> "monday"
        2 -> "tusday"
        3 -> "wednesday"
        else -> "sunday"
    }
    println(result)

    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        else -> println("blue")
    }

    val result1 = when (getNumber()) {
        0, 1 -> println("zero or one")
        else -> println("minimum2")
    }
    println(result1)




}
fun getNumber()=2
enum class Color{RED, GREEN}
fun getColor() = Color.RED