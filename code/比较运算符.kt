fun main(args: Array<String>) {

    var s1: String = "javascript"
    var s2: String = "kotlin"

    //两个字符串并不能直接这样比较
    val s3: Boolean = s1 > s2

    //可以比较长度
    val s4: Boolean = s1.length > s2.length

    println("$s3\t,$s4\t")

}
