class MonotonicArray {
    fun isMonotonic(nums: IntArray): Boolean {
         if (nums.size <= 1) return true

        var increasing = true
        var decreasing = true

        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i]) increasing = false
            if (nums[i - 1] < nums[i]) decreasing = false
        }

        return increasing || decreasing
    }
}
