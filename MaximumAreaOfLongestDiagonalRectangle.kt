class MaximumAreaOfLongestDiagonalRectangle {
    fun areaOfMaxDiagonal(dimensions: Array<IntArray>): Int {
        var maxDiagonalSq = -1
        var maxArea = -1
        var resultArea = 0
        for (rect in dimensions) {
            val length = rect[0]
            val width = rect[1]

            val diagonalSq = length * length + width * width
            val area = length * width

            if (diagonalSq > maxDiagonalSq) {
                maxDiagonalSq = diagonalSq
                maxArea = area
                resultArea = area
            } else if (diagonalSq == maxDiagonalSq) {
                if (area > maxArea) {
                    maxArea = area
                    resultArea = area
                }
            }
        }
        return resultArea
    }
}
