sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language: Backend developer")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language Frontend developer")
    }
}
data class AndroidDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language Android developer")
    }
}

data class IosDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language Ios developer")
    }
}


object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()
    fun add(developer: Developer) = when(developer){
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is AndroidDeveloper -> pool[developer.name] = developer
        is IosDeveloper -> pool[developer.name] = developer

    }

    fun get(name: String) = pool[name]

}

fun main(){
    val backendDeveloper = BackendDeveloper(name = "tony")
    DeveloperPool.add(backendDeveloper)
    val frontendDeveloper = FrontendDeveloper(name = "kazuya")
    DeveloperPool.add(frontendDeveloper)
    println(DeveloperPool.get("tony"))
    println(DeveloperPool.get("kazuya"))
}
