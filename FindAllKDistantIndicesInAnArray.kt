class FindAllKDistantIndicesInAnArray {
    fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
        val n = nums.size
        val keyIndices = mutableListOf<Int>()
        for (i in 0 until n) {
            if (nums[i] == key) {
                keyIndices.add(i)
            }
        }
        val kDistantSet = mutableSetOf<Int>()
        for (idx in keyIndices) {
            val start = maxOf(0, idx - k)
            val end = minOf(n - 1, idx + k)
            for (i in start..end) {
                kDistantSet.add(i)
            }
        }
        return kDistantSet.sorted()
    }
}
