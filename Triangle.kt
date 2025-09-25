class Triangle {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val n = triangle.size
        val dp = IntArray(n)

        for (i in 0 until n) {
            dp[i] = triangle[n - 1][i]
        }

        for (row in n - 2 downTo 0) {
            for (col in 0..row) {
                dp[col] = triangle[row][col] + minOf(dp[col], dp[col + 1])
            }
        }

        return dp[0]
    }
}
