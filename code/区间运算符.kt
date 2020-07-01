fun main(args: Array<String>) {

    //闭区间运算符
    var range: IntRange = 0..5
    var sum: Int = 0
    for (i in range) {
        sum += i
    }
    println(sum)
    println("=====================")


    //半开区间运算符
    val books: Array<String> = arrayOf("java", "kotlin", "flutter", "ruby", "php")
    for (index in 0 until books.size) {
        println("${index + 1}种语言是：${books[index]}")
    }
    println("=====================")


    //反向区间
    var range2: IntProgression = 6 downTo 0

    for (i in range2) {
        println(i)
    }

    println("=====================")

    //设置区间的元素间隔
    var range3: IntProgression = 6 downTo 0 step 3
    for (i in range3) {
        println(i)
    }

}
