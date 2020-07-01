fun main(args: Array<String>) {
    var a = 6
    var b = 9
    var result = max(a, b)
    println("result:${result}")
    println(sayHi("孙悟空"))
}


fun max(x: Int, y: Int): Int {
    val z = if (x > y) x else y
    return z
}

fun sayHi(name: String): String {
    println("正在执行函数sayhi")
    return "${name},先生，您好"
}
