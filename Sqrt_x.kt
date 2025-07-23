class Sqrt_x {
   fun mySqrt(x: Int): Int {
        var l = 0
        var r = x
        var res = 0
        while (l <= r) {
            val m = l + (r - l) / 2
            when {
                m.toLong() * m > x -> {
                    r = m - 1
                }
                m.toLong() * m < x -> {
                    l = m + 1
                    res = m
                }
                else -> {
                    return m
                }
            }
        }
        return res
    }
}
