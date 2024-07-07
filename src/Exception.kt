fun main(){
    try {
        throw Exception()
    } catch (e: Exception) {
        println("error")
    } finally {
        println("finally")
    }

    val a = try {
        "1234".toInt()
    }catch (e: Exception){
        println("exception")
    }
    println(a)

//    throw Exception("예외 발생")
}