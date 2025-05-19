class MaximumAscendingSubarraySum{
    fun maxAscendingSum(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var sum = 0
        var temp = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i]
            } else {
                sum = maxOf(sum, temp)
                temp = nums[i]
            }
        }
        return maxOf(sum, temp)
    }
}
