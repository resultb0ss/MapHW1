fun main() {
    val arrayNum = ArrayList<Int>()
    arrayNum.addAll(arrayOf(1,2,3,4,5,6,7,8,9))
    println(operation(arrayNum))


}

fun <K> operation(array: ArrayList<K>): Map<K,Int> {


    val myMap: MutableMap<K,Int> = mutableMapOf()
    for (i in array){
        val count = getIntCount(array,i)
        val keyMap: K = i
        myMap[keyMap] = count
    }
    val newMap = myMap.toMap()
    return newMap
}



fun <T> getIntCount(collection: ArrayList<T>, num: T): Int {
    var count = 0
    for (i in collection) {
        if (num == i) count++
    }
    return count

}
