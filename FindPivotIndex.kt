class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        val temp = IntArray(nums.size + 1)
        for (i in nums.indices) {
            temp[i + 1] = temp[i] + nums[i]
        }
        for (i in nums.indices) {
            val leftSum = temp[i]
            val rightSum = temp[nums.size] - temp[i + 1]
            if (leftSum == rightSum) {
                return i
            }
        }
        return -1
    }
}
