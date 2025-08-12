class DiameterOfABinaryTree {
    var max = 0;
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        height(root)

        return max;
    }
    fun height(root:TreeNode?): Int{
        if(root==null)
            return 0
        
        var left = height(root.left)
        var right = height(root.right)

        max = max(max,left+right)

        return max(left,right)+1
    }
}
