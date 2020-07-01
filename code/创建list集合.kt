fun main(args: Array<String>) {

    var list1 = mutableListOf<String>("java", "swift", "golang", "dart") //可变的list集合

    var list2 = listOf<String>("pig", "cat", "dog")

    var list3 = listOfNotNull("apple", "banana", "orange");

    list1.removeAt(0);

    println(list1)
    println(list2)
    println(list3)
}