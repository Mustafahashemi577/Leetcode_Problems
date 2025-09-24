class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    private lateinit var inorderIndex: MutableMap<Int, Int>
    private var postIndex = 0

    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        inorderIndex = mutableMapOf()
        for (i in inorder.indices) {
            inorderIndex[inorder[i]] = i
        }
        postIndex = postorder.size - 1
        return helper(inorder, postorder, 0, inorder.size - 1)
    }

    private fun helper(inorder: IntArray, postorder: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) return null

        val rootVal = postorder[postIndex--]
        val root = TreeNode(rootVal)
        val index = inorderIndex[rootVal]!!

        
        root.right = helper(inorder, postorder, index + 1, right)
        root.left = helper(inorder, postorder, left, index - 1)

        return root
    }
}
