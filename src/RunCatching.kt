fun getStr(): Nothing = throw Exception("initialization")

fun main(){
    val result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "initialization"
        }
    println(result)
}