import java.util.*

fun main(args: Array<String>) {

    var array1 = arrayOfNulls<String>(5)
    array1[0] = "cat";
    array1[1] = "pig";
    array1[2] = "dog";
    array1[3] = "rabbit";
    array1[4] = "snake";

    for (i in 0 until array1.size) {
        println(array1[i])
    }

}
