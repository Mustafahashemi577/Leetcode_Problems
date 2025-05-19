class NextGreaterElement_I {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val result = IntArray(nums1.size)
        for (i in nums1.indices) {
            var greater = -1
            for (j in nums2.size - 1 downTo 0) {
                if (nums2[j] > nums1[i]) {
                    greater = nums2[j]
                }
                if (nums2[j] == nums1[i]) {
                    break
                }
            }
            result[i] = greater
        }
        return result
    }
}
