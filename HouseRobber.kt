class HouseRobber {
    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        if (nums.size == 2) return maxOf(nums[0], nums[1])
        
        val dp = intArrayOf(nums[0],max(nums[1],nums[0]),0)
        for(i in 2 until nums.size){
            dp[2]=max(dp[1],nums[i]+dp[0])
            dp[0]=dp[1]
            dp[1]=dp[2]
        }
        return dp[2]
    }
}
