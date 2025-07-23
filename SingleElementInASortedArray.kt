class SingleElementInASortedArray {
    fun singleNonDuplicate(nums: IntArray): Int {
        if (nums.size == 1)
            return nums[0]
        if (nums[nums.size - 1] != nums[nums.size - 2])
            return nums[nums.size - 1]
        if (nums[0] != nums[1])
            return nums[0]

        var l = 0
        var r = nums.size - 1
        var result = 0

        while (l <= r) {
            val mid = (l + r) / 2
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                result = nums[mid]
                break
            } else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        return result
    }
}

