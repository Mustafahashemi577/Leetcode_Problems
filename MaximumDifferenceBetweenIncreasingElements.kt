class MaximumDifferenceBetweenIncreasingElements {
    fun maximumDifference(nums: IntArray): Int {
        var maxim = 0
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                maxim = maxOf(maxim, nums[j] - nums[i])
            }
        }
        return if (maxim > 0) maxim else -1
    }
}
