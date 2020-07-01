fun main(args: Array<String>) {

    foo()
    sayHi("明先生")
    showMsg("北京欢迎你",3)
}

fun foo(){
    println("定义一个函数，函数既无形参，也无返回值")
}

fun sayHi(name:String) : Unit{
    println("===程序执行sayHi函数===")
    println("${name},先生您好")
}

fun showMsg(msg:String,count:Int){
    for (i in 1 until count){
        println(msg)
    }
}


