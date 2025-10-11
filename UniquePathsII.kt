class UniquePathsII {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size
        val dp = Array(m) { IntArray(n) }
        var row = false
        var col = false

        for (i in 0 until n) {
            if (obstacleGrid[0][i] == 0) {
                dp[0][i] = if (!row) 1 else 0
            } else {
                row = true
                dp[0][i] = 0
            }
        }

        for (i in 0 until m) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = if (!col) 1 else 0
            } else {
                col = true
                dp[i][0] = 0
            }
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                dp[i][j] = if (obstacleGrid[i][j] == 1) {
                    0
                } else {
                    dp[i - 1][j] + dp[i][j - 1]
                }
            }
        }

        return dp[m - 1][n - 1]
    }
}

