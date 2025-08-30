class KthSmallestElementInABST {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val stack = ArrayDeque<TreeNode>()
        var curr = root
        var count = k
        while (stack.isNotEmpty() || curr != null) {
            while (curr != null) {
                stack.addLast(curr)
                curr = curr.left
            }
            curr = stack.removeLast()
            count--
            if (count == 0) {
                return curr.`val`
            }
            curr = curr.right
        }
        return -1
    }
}
