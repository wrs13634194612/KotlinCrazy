import java.util.*

fun main(args: Array<String>) {

    var array1 = arrayOf("java", "dart", "swift", "ruby")

    println(array1[1])

    println(array1.get(1))

    array1[1] = "php";

    array1.set(2, "javascript")

    println(Arrays.toString(array1))

}