class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    fun numSubseq(nums: IntArray, target: Int): Int {
        val MOD = 1_000_000_007
        nums.sort()
        val n = nums.size
        val pow2 = IntArray(n)
        pow2[0] = 1
        for (i in 1 until n) {
            pow2[i] = (pow2[i - 1] * 2 % MOD)
        }
        var left = 0
        var right = n - 1
        var result = 0
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result = (result + pow2[right - left]) % MOD
                left++
            } else {
                right--
            }
        }
        return result    
    }
}
