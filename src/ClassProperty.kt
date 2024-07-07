class Coffee constructor(
    var name: String ="",
    var price: Int =0,
    ){
    val brand: String
        get() = "starBucks"

    var quantity: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}
class EmptyClass
fun main(){
    val coffee = Coffee()
    coffee.name = "Americano"
    coffee.price =2000
    coffee.quantity = 1
    println("${coffee.quantity} ${coffee.brand} ${coffee.name}, ${coffee.price}")


}