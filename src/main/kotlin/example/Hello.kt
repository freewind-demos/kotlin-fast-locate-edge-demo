package example

fun findEdge(list: List<Int>): Int {
    var start = 0
    var end = list.size

    while (true) {
        if (end == start + 1)
            return start
        val middle = (end + start) / 2
        if (list[middle] == 0) {
            end = middle
        } else {
            start = middle
        }
    }
}

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    (0..12000).toList().forEach { list.add(1) }
    (0..30009).toList().forEach { list.add(0) }

    val edge = findEdge(list)
    println(edge)
}
