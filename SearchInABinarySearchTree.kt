class SearchInABinarySearchTree {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return search(root,`val`)
    }
    fun search(node:TreeNode?,`val`:Int): TreeNode?{
        if(node == null)
            return null
        if(node.`val` == `val`)
            return node
        if(node.`val`>`val`)
            return search(node.left,`val`)
        else
            return search(node.right,`val`)
    }
}
