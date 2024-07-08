class MyGenerics<out T>(val t: T)

class Bag<T>{
    fun saveAll(
        to: MutableList<in T>,
        from :MutableList<T>,
    ){
        to.addAll(from)
    }
}
fun main(){
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1","2"), mutableListOf<String>("3","4"))


//    val generics = MyGenerics("test")

//    val list1: MutableList<String> = mutableListOf()
//
//    val list2 = mutableListOf<String>()
//
//    val list3 : List<*> = listOf<String>("test")


//    val charGenerics : MyGenerics<CharSequence> = generics




    //PECS producer extends consumer super
    //공변성은 java generic extends kt out
    //반공변성 java generic super kt in
}