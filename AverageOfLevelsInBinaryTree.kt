class AverageOfLevelsInBinaryTree {
    fun averageOfLevels(root: TreeNode?): List<Double> {
        val ans = mutableListOf<Double>()
        if (root == null) return ans

        val q: ArrayDeque<TreeNode> = ArrayDeque()
        q.add(root)

        while (q.isNotEmpty()) {
            val len = q.size
            var sum: Long = 0
            repeat(len) {
                val current = q.removeFirst()
                sum += current.`val`
                current.left?.let { q.add(it) }
                current.right?.let { q.add(it) }
            }
            ans.add(sum.toDouble() / len)
        }

        return ans
    }
}
