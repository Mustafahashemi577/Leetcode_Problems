class InsertIntoABinarySearchTree {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return TreeNode(`val`)
        if (`val` < root.`val`) {
            root.left = insertIntoBST(root.left, `val`)
        } else if (`val` > root.`val`) {
            root.right = insertIntoBST(root.right, `val`)
        }
        return root
    }
}
