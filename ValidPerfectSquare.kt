class ValidPerfectSquare {
    fun isPerfectSquare(num: Int): Boolean {
        if (num < 0) return false
        if (num == 0 || num == 1) return true

        var left = 1L
        var right = num / 2L
        while (left <= right) {
            val mid = left + (right - left) / 2
            val sq = mid * mid
            when {
                sq == num.toLong() -> return true
                sq < num -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return false
    }
}

