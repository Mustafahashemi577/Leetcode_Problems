class LongestHarmoniousSubsequence {
    fun findLHS(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        var maxLength = 0
        for (key in map.keys) {
            if ((key + 1) in map) {
                val length = map[key]!! + map[key + 1]!!
                maxLength = maxOf(maxLength, length)
            }
        }
        return maxLength
    }
}
