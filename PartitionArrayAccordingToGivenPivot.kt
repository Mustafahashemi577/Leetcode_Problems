class PartitionArrayAccordingToGivenPivot {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val result = IntArray(nums.size)
        var i = 0
        for (num in nums) {
            if (num < pivot) {
                result[i++] = num
            }
        }
        for (num in nums) {
            if (num == pivot) {
                result[i++] = num
            }
        }
        for (num in nums) {
            if (num > pivot) {
                result[i++] = num
            }
        }
        return result
    }
}
