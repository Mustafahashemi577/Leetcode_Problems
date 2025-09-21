class KthLargestSumInABinaryTree {
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        if (root == null) return -1

        val ans = mutableListOf<Long>()
        val queue: ArrayDeque<TreeNode> = ArrayDeque()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            var currLevelSum = 0L

            repeat(levelSize) {
                val curr = queue.removeFirst()
                currLevelSum += curr.`val`

                curr.left?.let { queue.add(it) }
                curr.right?.let { queue.add(it) }
            }

            ans.add(currLevelSum)
        }

        ans.sort()
        return if (k > ans.size) -1 else ans[ans.size - k]
    }
}
