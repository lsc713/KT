class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}
interface Cart: Wheel {
    var coin: Int

    val weight : String
        get() = "200KG"

    fun add(product : Product)
    fun rent(){
        if (coin > 0) {
            println("카트 대여")
        }
    }

    fun printId() = println("1234")


    override fun roll(){
        println("카트가 굴러갑니다.")
    }

}
interface Order{
    fun add(product: Product){
        println("${product.name}")
    }

    fun printId() = println("1234")

}
class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {
        if (coin<=0) println("코인을 넣어주세요")
        else println("${product.name}이 추가 되었습니다.")

        super<Order>.add(product)
    }

    override fun printId(){
        super<Order>.printId()
        super<Cart>.printId()
    }


}

fun main() {

    var cart = MyCart(5)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "toy", price = 1000))
    cart.printId()

}