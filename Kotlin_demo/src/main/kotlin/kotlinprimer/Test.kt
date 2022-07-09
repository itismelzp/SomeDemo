package kotlinprimer



fun main(args: Array<String>) {
    function("")

    test1 {
        println("hello")
    }
    println("hello")
}

inline fun test1(l : () -> Unit) {
    l.invoke()
    return
}

fun function(str: String) {
//    val fmt1 = format(str)
//    println(fmt1.length)
//    val fmt2: String = format(str)
//    val fmt3: String? = format(str)
//    println(fmt3?.length)

}
