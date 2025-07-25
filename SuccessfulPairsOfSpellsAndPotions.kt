class SuccessfulPairsOfSpellsAndPotions {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        val m = potions.size
        val result = IntArray(spells.size)
        for (i in spells.indices) {
            var left = 0
            var right = m - 1
            var idx = m
            while (left <= right) {
                val mid = (left + right) / 2
                if (spells[i].toLong() * potions[mid] >= success) {
                    right = mid - 1
                    idx = mid
                } else {
                    left = mid + 1
                }
            }
            result[i] = m - idx
        }
        return result
    }
}
