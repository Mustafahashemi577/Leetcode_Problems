class TwoSumIVInputIsInABST {
    private val set = HashSet<Int>()
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        if(root==null)
            return false
        if(set.contains(k-root.`val`))
            return true
        set.add(root.`val`)
        return findTarget(root.left,k)||findTarget(root.right,k)
    }
}
