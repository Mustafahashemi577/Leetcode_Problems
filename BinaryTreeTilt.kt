class BinaryTreeTilt {
    private var sum = 0

    fun findTilt(root: TreeNode?): Int {
        find(root)
        return sum
    }

    private fun find(root: TreeNode?): Int {
        if (root == null) return 0
        val left = find(root.left)
        val right = find(root.right)
        sum += kotlin.math.abs(left - right)
        return root.`val` + left + right
    }
}
