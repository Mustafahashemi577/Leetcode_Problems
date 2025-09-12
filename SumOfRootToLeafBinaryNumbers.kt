class SumOfRootToLeafBinaryNumbers {
    fun sumRootToLeaf(root: TreeNode?): Int {
        return binarySum(root,0)
    }
    fun binarySum(node: TreeNode?,curSum: Int): Int{
        if(node == null)
            return 0
        
        val newSum = 2 * curSum + node.`val`
        if(node.left==null && node.right==null)
            return newSum
        
        return binarySum(node.left,newSum)+binarySum(node.right,newSum)
    }
}
