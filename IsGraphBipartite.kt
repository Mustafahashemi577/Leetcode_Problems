class IsGraphBipartite {
    fun isBipartite(graph: Array<IntArray>): Boolean {
        val n = graph.size
        val color = IntArray(n) { -1 }

        for (i in 0 until n) {
            if (color[i] == -1 && !dfs(i, 0, color, graph)) {
                return false
            }
        }
        return true
    }

    private fun dfs(node: Int, c: Int, color: IntArray, graph: Array<IntArray>): Boolean {
        color[node] = c
        for (neighbor in graph[node]) {
            if (color[neighbor] == -1) {
                if (!dfs(neighbor, 1 - c, color, graph)) return false
            } else if (color[neighbor] == color[node]) {
                return false
            }
        }
        return true
    }
}

