fun main(args: Array<String>) {
    novel()
    println(novel("西游记"))
    println(novel(699,"钢铁是怎样炼成的"))
}

fun novel() {
    println("小说大全")
}

fun novel(name: String): String {
    return name;
}

fun novel(nums: Int, name: String): String {
    return "书名：$name,页数：$nums";
}




