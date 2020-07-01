fun main(args: Array<String>) {

    for(i in 0..3){
        println("判断处理前：$i")
        if (i==1){
            continue
        }
        println("判断处理后：$i")
    }
}
