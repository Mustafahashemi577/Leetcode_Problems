class NthTribonacciNumber {
    fun tribonacci(n: Int): Int {
        val dp = intArrayOf(0,1,1)
        if(n<=2)
            return dp[n]
        for(i in 3..n){
            val cur = dp[0]+dp[1]+dp[2]
            dp[0]=dp[1]
            dp[1]=dp[2]
            dp[2]=cur
        }
        return dp[2]
    }
}
