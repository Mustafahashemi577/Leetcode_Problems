class FindPeakElement {
    fun findPeakElement(nums: IntArray): Int {
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val m = l + (r - l) / 2
            if (m > 0 && nums[m] < nums[m - 1]) {
                r = m - 1
            } else if (m < nums.size - 1 && nums[m] < nums[m + 1]) {
                l = m + 1
            } else {
                return m
            }
        }
        return -1
    }
}

