class FindMissingAndRepeatedValues {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val n = grid.size
        val set = HashSet<Int>()
        val result = IntArray(2)
        for (i in 0 until n) {
            for (j in 0 until n) {
                val value = grid[i][j]
                if (!set.contains(value))
                    set.add(value)
                else
                    result[0] = value
            }
        }
        for (i in 1..(n * n)) {
            if (!set.contains(i)) {
                result[1] = i
                break
            }
        }
        return result
    }
}
