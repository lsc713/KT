import java.time.LocalDateTime

//object Singleton {
//    val a = 1234
//    fun printA() = println(a)
//
//}
//
//fun main(){
//    println(Singleton.a)
//    Singleton.printA()
//}

//object DatetimeUtils{
//    val now : LocalDateTime
//        get() = LocalDateTime.now()
//
//    const val DEFAULT_FORMAT = "yyyy-MM-dd"
//
//    fun same(a: LocalDateTime, b : LocalDateTime) : Boolean {
//        return a==b
//    }
//}
//
//fun main(){
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//}

class MyClass{

    private  constructor()
    companion object {
        val a = 1234
        fun newInstance() = MyClass()
    }
}
fun main(){
    println(MyClass.a)
    println(MyClass.newInstance())
    println(MyClass.Companion.a)
}