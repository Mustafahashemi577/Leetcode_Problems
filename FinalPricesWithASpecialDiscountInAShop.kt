class FinalPricesWithASpecialDiscountInAShop {
    fun finalPrices(prices: IntArray): IntArray {
        val n = prices.size
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (prices[j] <= prices[i]) {
                    prices[i] -= prices[j]
                    break
                }
            }
        }
        return prices
    }
}

