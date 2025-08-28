class MinimumAbsoluteDifferenceInBST {
    private var minDiff = Int.MAX_VALUE
    private var prevValue: Int? = null

    fun getMinimumDifference(root: TreeNode?): Int {
        minDiff = Int.MAX_VALUE
        prevValue = null
        inorder(root)
        return minDiff
    }

    private fun inorder(root: TreeNode?) {
        if (root == null) return

        inorder(root.left)

        prevValue?.let { prev ->
            val diff = root.`val` - prev
            if (diff < minDiff) {
                minDiff = diff
            }
        }
        prevValue = root.`val`

        inorder(root.right)
    }
}

