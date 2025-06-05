class SortThePeople {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
       val map = mutableMapOf<Int, String>()
        for (i in heights.indices) {
            map[heights[i]] = names[i]
        }
        heights.sort()
        val result = Array(heights.size) { "" }
        for (i in heights.indices) {
            result[i] = map[heights[heights.size - 1 - i]]!!
        }
        return result
    }
}
