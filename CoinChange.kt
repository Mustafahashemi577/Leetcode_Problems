class CoinChange {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount+1)
        Arrays.fill(dp,amount+1)
        dp[0]=0

        for(i in 1..amount){
            for(coin in coins){
                if(i-coin >= 0)
                    dp[i]=min(dp[i],dp[i-coin]+1)
            }
        }
        return if(dp[amount]>amount) -1 else dp[amount]
    }
}
