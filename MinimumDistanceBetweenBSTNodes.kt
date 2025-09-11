class MinimumDistanceBetweenBSTNodes {
    private var prev: TreeNode? = null
    private var min = Int.MAX_VALUE

    fun minDiffInBST(root: TreeNode?): Int {
        inOrder(root)
        return min
    }

    private fun inOrder(root: TreeNode?) {
        if (root == null) return
        inOrder(root.left)
        prev?.let {
            min = minOf(min, root.`val` - it.`val`)
        }
        prev = root
        inOrder(root.right)
    }
}
