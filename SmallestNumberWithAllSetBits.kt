class SmallestNumberWithAllSetBits {
    fun smallestNumber(n: Int): Int {
        val binarySet = intArrayOf(1, 3, 7, 15, 31, 63, 127, 255, 511, 1023)
        for (value in binarySet) {
            if (value >= n) {
                return value
            }
        }
        return 1023
    }
}

