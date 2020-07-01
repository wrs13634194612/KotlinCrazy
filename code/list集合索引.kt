fun main(args: Array<String>) {

    var list1 = mutableListOf<String>("java", "swift", "golang", "dart") //可变的list集合

    var list2 = listOf<String>("pig", "cat", "dog")

    var list3 = listOfNotNull("apple", "banana", "orange");

    list1.removeAt(0);

    val a = list2.indexOf("cat")

    println("list2索引位置：$a") //返回-1表示集合中不存在此元素
    println(list1)
    println(list2)
    println(list3)
}