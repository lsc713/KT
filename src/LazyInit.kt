class HellBot{
    val greeting: String by lazy {
        println("initialization")
        getHello() }
    fun sayHello() = println(greeting)
}

fun getHello() = "hello"

fun main() {
    val hellBot = HellBot()


    for (i in 1..5) {
        Thread{
            hellBot.sayHello()

        }.start()

    }
}