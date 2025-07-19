class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size - 1)
    }
    private fun binarySearch(nums: IntArray, target: Int, left: Int, right: Int): Int {
        if (left > right) return -1
        val mid = (left + right) / 2
        return when {
            nums[mid] == target -> mid
            nums[mid] < target -> binarySearch(nums, target, mid + 1, right)
            else -> binarySearch(nums, target, left, mid - 1)
        }
    }
}

