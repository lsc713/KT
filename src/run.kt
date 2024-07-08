fun main(){
    val str: String = "hi"
    var result: Int = str.let {
        println(it)

        val abc: String = "abc"
        val def: String = "Def"
        if (!abc.isNullOrEmpty() && !def.isNullOrEmpty()) {
            println("abcdef is not null")
        }
        1234

    }
    println(result)
}