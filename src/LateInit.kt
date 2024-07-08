class `7 LateExample` {

    lateinit var text: String

    fun printText() {
        if (this::text.isInitialized) {
            text = "initializerd"
        }else{
            text = "hi"
        }
        println(text)

    }
}

fun main(){
    val test = `7 LateExample`()
    test.printText()
}