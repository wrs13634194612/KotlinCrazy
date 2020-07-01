fun main(args: Array<String>) {

    var set1 = setOf<String>("java", "kotlin", "go")
    println(set1)
    var mutableSet2 = mutableSetOf<String>("java", "kotlin", "php")
    println(mutableSet2)

    mutableSet2.remove("java")

    println(mutableSet2)

    var hashset3 = hashSetOf<String>("pig", "cat", "ege") //乱序  比较特殊，其他两个linkset和treeset是有序的
    hashset3.remove("cat")
    println(hashset3)

    var linkedHashSet4 = linkedSetOf<String>("apple", "orange", "banana")
    linkedHashSet4.add("pineapple")
    println(linkedHashSet4)

    var treeSet5 = sortedSetOf("table", "chair", "cabinet")
    treeSet5.add("bed")
    println(treeSet5)


}