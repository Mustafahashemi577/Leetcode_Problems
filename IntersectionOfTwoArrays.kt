class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val set = nums1.toHashSet()
        val resultSet = mutableSetOf<Int>()
        for (num in nums2) {
            if (set.contains(num)) {
                resultSet.add(num)
            }
        }
        return resultSet.toIntArray()
    }
}
