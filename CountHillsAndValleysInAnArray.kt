class CountHillsAndValleysInAnArray {
    fun countHillValley(nums: IntArray): Int {
        var count = 0
        var left = 0
        for (i in 1 until nums.size - 1) {
            if (nums[i] != nums[i + 1]) {
                if ((nums[i] > nums[left] && nums[i] > nums[i + 1]) ||
                    (nums[i] < nums[left] && nums[i] < nums[i + 1])) {
                    count++
                }
                left = i
            }
        }
        return count
    }
}
