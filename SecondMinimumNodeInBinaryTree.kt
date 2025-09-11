class SecondMinimumNodeInBinaryTree {
    private val set = TreeSet<Int>()
    fun findSecondMinimumValue(root: TreeNode?): Int {
        dfs(root)
        return if (set.size == 1) -1 else set.elementAt(1)
    }
    private fun dfs(node: TreeNode?) {
        if (node == null) return
        dfs(node.left)
        set.add(node.`val`)
        dfs(node.right)
    }
}
