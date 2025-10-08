class PartitionEqualSubsetSum {
    fun canPartition(nums: IntArray): Boolean {
        var sum = 0
        for (n in nums) sum += n
        if (sum % 2 == 1) return false
        val target = sum / 2

        val dp = BooleanArray(target + 1)
        dp[0] = true

        for (num in nums) {
            if (num > target) continue
            for (s in target downTo num) {
                if (dp[s - num]) dp[s] = true
            }
            if (dp[target]) return true
        }
        return dp[target]
    }
}
