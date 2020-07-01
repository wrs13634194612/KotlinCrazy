fun main(args: Array<String>) {

    for (i in 0 until 10) {
        for (j in 1 until i+1) {
            println("$j*$i=${i * j}")
        }
    }
}
