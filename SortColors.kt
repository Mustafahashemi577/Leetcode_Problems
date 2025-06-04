class SortColors {
    fun sortColors(nums: IntArray): Unit {
        var low = 0
        var mid = 0
        var high = nums.size - 1

        while (mid <= high) {
            when (nums[mid]) {
                0 -> {
                    nums[low] = nums[mid].also { nums[mid] = nums[low] }
                    low++
                    mid++
                }
                1 -> mid++
                2 -> {
                    nums[mid] = nums[high].also { nums[high] = nums[mid] }
                    high--
                }
            }
        }
    }
}
