class ConstructStringFromBinaryTree {
    fun tree2str(root: TreeNode?): String {
        val res = StringBuilder()
        preorder(root, res)
        return res.substring(1, res.length - 1)
    }
    private fun preorder(root: TreeNode?, res: StringBuilder) {
        if (root == null) return
        res.append("(").append(root.`val`)
        if (root.left == null && root.right != null) {
            res.append("()")
        }
        preorder(root.left, res)
        preorder(root.right, res)
        res.append(")")
    }
}

