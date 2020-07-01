fun main(args: Array<String>) {

    val grade: Int = -9
    var result: String? = null;

    when (grade) {
        0, 1, 2, 3, 4, 5 -> {
            result = "不及格";
        }
        6, 7, 8 -> {
            result = "良好";
        }
        9, 10 -> {
            result = "优秀";
        }
        else -> {
            result = "输入成绩错误"
        }
    }
    println(result)
}
