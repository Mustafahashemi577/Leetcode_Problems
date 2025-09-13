class ReverseOddLevelsOfBinaryTree {
    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        traverse(root?.left, root?.right, 1)
        return root
    }

    private fun traverse(node1: TreeNode?, node2: TreeNode?, lvl: Int) {
        if (node1 == null || node2 == null) return

        if (lvl % 2 == 1) {
            val temp = node1.`val`
            node1.`val` = node2.`val`
            node2.`val` = temp
        }

        traverse(node1.left, node2.right, lvl + 1)
        traverse(node1.right, node2.left, lvl + 1)
    }
}
