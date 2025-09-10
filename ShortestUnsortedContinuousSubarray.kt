class ShortestUnsortedContinuousSubarray {
    fun findUnsortedSubarray(nums: IntArray): Int {
        val copy = nums.clone()
        copy.sort()
        var first = -1
        var last = -1

        for (i in nums.indices) {
            if (nums[i] != copy[i] && first == -1) {
                first = i
            }
            if (nums[i] != copy[i] && first != -1) {
                last = i
            }
        }
        return if (first != -1) last - first + 1 else 0
    }
}
