data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person("Alice", 29)
    val person2 = Person("Alice", 29)

    println(person1==person2)
    println(person2.toString())
    println("${person1.component1()},${person1.component2()}")
    val (name,age) = person1
    println("$name,$age")

}