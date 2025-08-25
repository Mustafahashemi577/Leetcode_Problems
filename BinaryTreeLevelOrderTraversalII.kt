class BinaryTreeLevelOrderTraversalII {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        if (root == null) return result

        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            val level = mutableListOf<Int>()

            repeat(levelSize) {
                val node = queue.removeFirst()
                level.add(node.`val`)
                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }

            result.add(0, level)
        }
        return result
    }
}

