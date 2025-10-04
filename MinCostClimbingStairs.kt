class MinCostClimbingStairs {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = intArrayOf(cost[0],cost[1],0)
        for(i in 2 until cost.size){
            dp[2] = cost[i]+Math.min(dp[0],dp[1])
            dp[0]=dp[1]
            dp[1]=dp[2]
        }
        return min(dp[1],dp[0])
    }
}
