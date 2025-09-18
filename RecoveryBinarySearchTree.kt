class RecoveryBinarySearchTree {
    private var first: TreeNode? = null
    private var second: TreeNode? = null
    private var prev: TreeNode? = null

    fun recoverTree(root: TreeNode?) {
        helper(root)
        val temp = first!!.`val`
        first!!.`val` = second!!.`val`
        second!!.`val` = temp
    }

    private fun helper(node: TreeNode?) {
        if (node == null) return

        helper(node.left)

        if (prev != null && prev!!.`val` > node.`val`) {
            if (first == null) {
                first = prev
            }
            second = node
        }

        prev = node

        helper(node.right)
    }
}

