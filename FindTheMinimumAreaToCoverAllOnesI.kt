class FindTheMinimumAreaToCoverAllOnesI {
    fun minimumArea(grid: Array<IntArray>): Int {
        val rows = grid.size
        if (rows == 0) return 0
        val cols = grid[0].size

        var minRow = Int.MAX_VALUE
        var minCol = Int.MAX_VALUE
        var maxRow = Int.MIN_VALUE
        var maxCol = Int.MIN_VALUE

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (grid[i][j] == 1) {
                    minRow = minOf(minRow, i)
                    minCol = minOf(minCol, j)
                    maxRow = maxOf(maxRow, i)
                    maxCol = maxOf(maxCol, j)
                }
            }
        }
        if (maxRow == Int.MIN_VALUE) return 0

        return (maxRow - minRow + 1) * (maxCol - minCol + 1)
    }
}

