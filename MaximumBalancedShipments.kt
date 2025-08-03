class MaximumBalancedShipments {
    fun maxBalancedShipments(weight: IntArray): Int {
        var count = 0
        var maxSoFar = weight[0]
        var start = 0
        var i = 1
        while (i < weight.size) {
            maxSoFar = maxOf(maxSoFar, weight[i])
            if (weight[i] < maxSoFar) {
                count++
                start = i + 1
                if (start < weight.size) {
                    maxSoFar = weight[start]
                    i = start
                    continue
                }
            }
            i++
        }
        return count    
    }
}
