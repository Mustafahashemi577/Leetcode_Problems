class IncreasingOrderSearchTree {
    private val list = mutableListOf<Int>()

    fun increasingBST(root: TreeNode?): TreeNode? {
        inorder(root)
        if (list.isEmpty()) return null

        val newNode = TreeNode(list[0])
        var current = newNode
        for (i in 1 until list.size) {
            current.right = TreeNode(list[i])
            current = current.right!!
        }
        return newNode
    }

    private fun inorder(node: TreeNode?) {
        if (node == null) return
        inorder(node.left)
        list.add(node.`val`)
        inorder(node.right)
    }
}
