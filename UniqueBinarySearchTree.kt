class UniqueBinarySearchTree {
    fun numTrees(n: Int): Int {
        val uniqueTree = IntArray(n + 1) { 1 }

        for (nodes in 2..n) {
            var total = 0
            for (root in 1..nodes) {
                total += uniqueTree[root - 1] * uniqueTree[nodes - root]
            }
            uniqueTree[nodes] = total
        }

        return uniqueTree[n]
    }
}
