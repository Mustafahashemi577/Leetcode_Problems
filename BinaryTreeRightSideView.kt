class BinaryTreeRightSideView {
    private val res = mutableListOf<Int>()
    fun rightSideView(root: TreeNode?): List<Int> {
        dfs(root, 0)
        return res
    }
    private fun dfs(node: TreeNode?, depth: Int) {
        if (node == null) return
        if (res.size == depth) {
            res.add(node.`val`)
        }
        dfs(node.right, depth + 1)
        dfs(node.left, depth + 1)
    }
}
