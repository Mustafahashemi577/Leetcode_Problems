class BrickWall {
    fun leastBricks(wall: List<List<Int>>): Int {
        val map = mutableMapOf<Int, Int>()
        for (row in wall) {
            var edge = 0
            for (i in 0 until row.size - 1) {
                edge += row[i]
                map[edge] = map.getOrDefault(edge, 0) + 1
            }
        }
        val maxEdges = map.values.maxOrNull() ?: 0
        return wall.size - maxEdges
    }
}
