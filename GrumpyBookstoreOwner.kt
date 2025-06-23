class GrumpyBookstoreOwner {
    fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int {
        val n = customers.size
        var i = 0
        var curwin = 0
        var maxwin = 0
        for (j in 0 until n) {
            curwin += customers[j] * grumpy[j]
            if (j >= minutes - 1) {
                maxwin = maxOf(maxwin, curwin)
                curwin -= customers[i] * grumpy[i]
                i++
            }
        }
        var res = maxwin
        for (k in 0 until n) {
            res += customers[k] * (1 - grumpy[k])
        }
        return res
    }
}
