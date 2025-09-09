class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortWith(compareBy { it[0] })
        val merged = mutableListOf<IntArray>()
        var prev = intervals[0]
        for (i in 1 until intervals.size) {
            val interval = intervals[i]
            if (interval[0] <= prev[1]) {
                prev[1] = maxOf(prev[1], interval[1])
            } else {
                merged.add(prev)
                prev = interval
            }
        }
        merged.add(prev)
        return merged.toTypedArray()
    }
}
