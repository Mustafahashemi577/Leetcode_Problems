class MergeTwo2DArraysBySummingValues {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val map = mutableMapOf<Int, Int>()
        for (a in nums1) {
            map[a[0]] = map.getOrDefault(a[0], 0) + a[1]
        }
        for (a in nums2) {
            map[a[0]] = map.getOrDefault(a[0], 0) + a[1]
        }
        val sortedKeys = map.keys.sorted()
        val result = Array(map.size) { IntArray(2) }

        for ((i, key) in sortedKeys.withIndex()) {
            result[i][0] = key
            result[i][1] = map[key]!!
        }
        return result
    }
}
