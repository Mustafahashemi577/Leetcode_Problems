class FindNUniqueIntegersSumUpToZero {
    fun sumZero(n: Int): IntArray {
        val res = IntArray(n)
        var index = 0
        for (i in 1..n / 2) {
            res[index++] = i
            res[index++] = -i
        }
        if (n % 2 != 0) {
            res[index] = 0
        }
        return res
    }
}
