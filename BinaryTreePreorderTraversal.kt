class BinaryTreePreorderTraversal {
    private val res = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        res.clear()
        preorder(root)
        return res
    }
    private fun preorder(node: TreeNode?) {
        if (node == null) return
        res.add(node.`val`)
        preorder(node.left)
        preorder(node.right)
    }
}

