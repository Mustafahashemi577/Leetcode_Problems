class UnivaluedBinaryTree {
    private var previous =-1
    fun isUnivalTree(root: TreeNode?): Boolean {
        if(root==null) return true
        previous = root.`val`
        return preOrder(root)
    }
    fun preOrder(node: TreeNode?): Boolean{
        if(node == null)
            return true
        if(node.`val` != previous)
            return false
        previous = node.`val`
        return preOrder(node.left)&&preOrder(node.right)
    }
}
