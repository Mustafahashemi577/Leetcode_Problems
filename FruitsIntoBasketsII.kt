class FruitsIntoBasketsII {
    fun numOfUnplacedFruits(fruits: IntArray, baskets: IntArray): Int {
        val n = fruits.size
        var alloted = 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (fruits[i] <= baskets[j]) {
                    alloted++
                    baskets[j] = -1
                    break
                }
            }
        }
        return n - alloted
    }
}
