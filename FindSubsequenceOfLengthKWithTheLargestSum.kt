class FindSubsequenceOfLengthKWithTheLargestSum {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        val numWithIndex = nums.mapIndexed { index, value -> intArrayOf(value, index) }
        val topK = numWithIndex
            .sortedWith(compareByDescending<IntArray> { it[0] })
            .take(k)
            .sortedBy { it[1] } 
        return topK.map { it[0] }.toIntArray()
    }
}
