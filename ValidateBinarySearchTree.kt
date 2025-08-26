class ValidateBinarySearchTree {
     fun isValidBST(root: TreeNode?): Boolean {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }
    private fun valid(node: TreeNode?, min: Long, max: Long): Boolean {
        if (node == null) return true
        if (node.`val` <= min || node.`val` >= max) return false
        return valid(node.left, min, node.`val`.toLong()) &&
               valid(node.right, node.`val`.toLong(), max)
    }
}
