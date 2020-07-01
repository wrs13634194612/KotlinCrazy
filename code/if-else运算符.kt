fun main(args: Array<String>) {

    val grade: Int = 101
    var result: String;

    if (grade < 60) {
        result = "不及格"
    } else if (grade < 70) {
        result = "中等"
    } else if (grade < 85) {
        result = "良好"
    } else if (grade < 101) {
        result = "优秀"
    } else {
        result = "输入成绩不正确，请核对重新输入"
    }
    println(result)

}
