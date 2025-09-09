class SumOfLeftLeaves {
    private var sum = 0
    fun sumOfLeftLeaves(root: TreeNode?): Int {
       return leftSum(root,false)
    }
    private fun leftSum(root:TreeNode?,flag : Boolean): Int{
        if(root==null)
            return 0
        leftSum(root.right,false)
        leftSum(root.left,true)
        if(flag && root.left==null && root.right==null)
            sum+=root.`val`
        return sum
        
    }
}
