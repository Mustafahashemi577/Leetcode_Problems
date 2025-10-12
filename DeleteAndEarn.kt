class DeleteAndEarn {
    fun deleteAndEarn(nums: IntArray): Int {
        var maxNum = 0
        for(num in nums)
            maxNum = max(maxNum,num)

        val points = IntArray(maxNum+1)
        for(num in nums)
            points[num] += num

        val dp = IntArray(3)

        for(i in 0..maxNum){
            dp[0]=max(dp[1],dp[2]+points[i])
            dp[2]=dp[1]
            dp[1]=dp[0]
        }
        return dp[0]
    }
}
