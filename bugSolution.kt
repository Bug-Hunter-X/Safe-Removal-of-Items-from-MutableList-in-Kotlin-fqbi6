fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 2]
} 