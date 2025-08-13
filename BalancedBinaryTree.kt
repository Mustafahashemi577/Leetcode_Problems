class BalancedBinaryTree {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        val left = height(root.left)
        val right = height(root.right)
        if (kotlin.math.abs(left - right) > 1) return false
        return isBalanced(root.left) && isBalanced(root.right)
    }

    fun height(root: TreeNode?): Int {
        if (root == null) return 0
        return maxOf(height(root.left), height(root.right)) + 1
    }
}
