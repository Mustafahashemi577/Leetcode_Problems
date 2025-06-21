class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var l = 0
        var r = 1
        while(r<prices.size){
            if(prices[l]<prices[r]){
                var temp = prices[r]-prices[l]
                profit=max(profit,temp)
            }
            else
                l=r
            r++
        }
        return profit
    }
}
