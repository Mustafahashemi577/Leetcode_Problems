class HeightChecker {
    fun heightChecker(heights: IntArray): Int {
        val sorted = heights.clone()
        sorted.sort()
        var count = 0
        for (i in heights.indices) 
            if (heights[i] != sorted[i]) 
                count++
            
        return count
    }
}
