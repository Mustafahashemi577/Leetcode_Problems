class CousinsInBinaryTree {
    private var xDepth = -1
    private var yDepth = -1
    private var xParent: TreeNode? = null
    private var yParent: TreeNode? = null

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        dfs(root, null, 0, x, y)
        return xDepth == yDepth && xParent != yParent
    }

    private fun dfs(node: TreeNode?, parent: TreeNode?, depth: Int, x: Int, y: Int) {
        if (node == null) return

        if (node.`val` == x) {
            xDepth = depth
            xParent = parent
        } else if (node.`val` == y) {
            yDepth = depth
            yParent = parent
        }

        dfs(node.left, node, depth + 1, x, y)
        dfs(node.right, node, depth + 1, x, y)
    }
}

