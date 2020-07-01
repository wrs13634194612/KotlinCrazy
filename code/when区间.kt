fun main(args: Array<String>) {

    val grade: Int = 120
    var result: String? = null;

    when (grade) {
        in 0..59 -> {
            result = "及格"
        }
        in 60..79 -> {
            result = "一般"
        }
        in 80..100 -> {
            result = "优秀"
        }
        else -> {
            result = "成绩输入错误"
        }
    }
    println(result)
}
