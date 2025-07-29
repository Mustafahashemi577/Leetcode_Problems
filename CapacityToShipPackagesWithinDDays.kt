class CapacityToShipPackagesWithinDDays {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var left = weights.maxOrNull()!!
        var right = weights.sum()
        var result = right

        while (left <= right) {
            val mid = (left + right) / 2
            if (canShip(weights, days, mid)) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return result
    }

    private fun canShip(weights: IntArray, days: Int, capacity: Int): Boolean {
        var requiredDays = 1
        var currentLoad = 0

        for (weight in weights) {
            if (currentLoad + weight > capacity) {
                requiredDays++
                if (requiredDays > days) return false
                currentLoad = 0
            }
            currentLoad += weight
        }

        return true
    }
}

