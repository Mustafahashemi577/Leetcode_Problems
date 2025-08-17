class PathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return dfs(root,0,targetSum)
    }
    fun dfs(node:TreeNode?, curSum:Int, targetSum:Int): Boolean{
        if(node==null) return false
        
        val newSum = curSum + node.`val`
        if (node.left == null && node.right == null) {
            return newSum == targetSum
        }
        return dfs(node.left, newSum, targetSum) || dfs(node.right, newSum, targetSum)
    }
}
