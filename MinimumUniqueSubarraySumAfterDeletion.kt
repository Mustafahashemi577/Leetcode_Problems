class MinimumUniqueSubarraySumAfterDeletion {
    fun maxSum(nums: IntArray): Int {
        val set = nums.toSet()
        val list = set.sorted()
        var max = list.last()
        for (i in list.size - 2 downTo 0) {
            max = maxOf(max, max + list[i])
        }
        return max
    }
}
