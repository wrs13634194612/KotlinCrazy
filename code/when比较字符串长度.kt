fun main(args: Array<String>) {

    var a: String = "javascript"
    var b: String = "googlekotlin";

    when (a.length > b.length) {
        true -> {
            println("a 大于b")
        }
        false -> {
            println("a 小于b")
        }
    }

}
 
