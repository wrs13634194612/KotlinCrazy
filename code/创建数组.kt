import java.util.*

fun main(args: Array<String>) {

    var array1 = arrayOf("java","dart","swift","ruby")
    var array2 = arrayOf(12,56,8,46)
    var array3 = arrayOfNulls<Double>(5)
    var array4 = arrayOfNulls<Int>(6)
    var array5 = emptyArray<String>()
    var array6 = emptyArray<Int>()
    var array7 = intArrayOf(45,89,3,6,18)
    var array8 = doubleArrayOf(2.3,5.69,6.21,4.78)

    println("${Arrays.toString(array7)}\n${Arrays.toString(array8)}")

}
