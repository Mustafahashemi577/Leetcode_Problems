class SearchA2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix[0].size
        var r = 0
        var c = n - 1
        while (r < m && c >= 0) {
            when {
                matrix[r][c] > target -> c--
                matrix[r][c] < target -> r++
                else -> return true
            }
        }
        return false
    }
}
