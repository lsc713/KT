//open class Dog {
//    open var age: Int = 0
//    open fun bark() {
//        println("멍멍")
//    }
//}
//
//open class Bulldog(override var age: Int = 0) : Dog() {
//    override fun bark() {
//        println("멍")
//    }
//}
//
//class ChildBulldog : Bulldog() {
//    override var age: Int = 0;
//    override fun bark() {
//        super.bark()
//    }
//}
//
//abstract class Developer{
//    abstract var age: Int
//    abstract fun code(Language: String)
//}
//
//class BackendDeveloper(override var age : Int) : Developer() {
//    override fun code(language: String) {
//        println("$language")
//    }
//}
//
//fun main() {
//    val dog = Bulldog(age = 2)
//    println(dog.age)
//    dog.bark()
//
//    var backendDeveloper = BackendDeveloper(age = 20)
//    println(backendDeveloper.age)
//    backendDeveloper.code("KOTLIN")
//}