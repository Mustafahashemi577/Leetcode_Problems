class ArrangingCoins {
    fun arrangeCoins(n: Int): Int {
        var l = 0
        var r = n
        var result = 0

        while (l <= r) {
            val mid = l + (r - l) / 2
            val coin = mid.toLong() * (mid + 1) / 2
            if (coin > n) {
                r = mid - 1
            } else {
                l = mid + 1
                result = maxOf(result, mid)
            }
        }

        return result
    }
}

