fun main(args: Array<String>) {

    var map1 = mutableMapOf<String, String>("红楼梦" to "曹雪芹", "西游记" to "吴承恩", "水浒传" to "施耐庵", "三国演义" to "罗贯中")

    map1.remove("红楼梦")

    println(map1)

    var map2 = mapOf<Int,String>(0 to "张飞",1 to "关羽",2 to "刘备")

    println("============")

    println(map2)

    var map3 = linkedMapOf<String,String>("红楼梦" to "曹雪芹", "西游记" to "吴承恩", "水浒传" to "施耐庵", "三国演义" to "罗贯中")

    map3.remove("三国演义")
    println(map3)

    println("============")

    var map4 = sortedMapOf("红楼梦" to "曹雪芹", "西游记" to "吴承恩", "水浒传" to "施耐庵", "三国演义" to "罗贯中")

    map4.remove("水浒传")

    println(map4)
    println("============")

    for (en in map1.entries) {
        println("${en.key}->${en.value}")
    }

    println("============")

    map1.forEach({ println("${it.key}->${it.value}") })
}