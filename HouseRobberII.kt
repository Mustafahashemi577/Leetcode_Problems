class HouseRobberII {
    fun rob(nums: IntArray): Int {
        if(nums.size==1) return nums[0]
        if(nums.size==2) return max(nums[0],nums[1])
        if(nums.size==3) return max(nums[0],max(nums[1],nums[2]))

        val dp = intArrayOf(nums[0],max(nums[0],nums[1]),0)

        for(i in 2..nums.size-2){
            dp[2]=max(dp[1],nums[i]+dp[0])
            dp[0]=dp[1]
            dp[1]=dp[2]
        }
        var max = dp[2]
        dp[0]=nums[1]
        dp[1]=max(nums[1],nums[2])
        dp[2]=0
        
        for(i in 3..nums.size-1){
            dp[2]=max(dp[1],nums[i]+dp[0])
            dp[0]=dp[1]
            dp[1]=dp[2]
        }
        return max(dp[2],max)
    }
}
