class EvaluateBooleanBinaryTree {
     fun evaluateTree(root: TreeNode?): Boolean {
        if (root?.left == null) {
            return root?.`val` == 1
        }
        return when (root.`val`) {
            2 -> evaluateTree(root.left) || evaluateTree(root.right)
            3 -> evaluateTree(root.left) && evaluateTree(root.right)
            else -> false
        }
    }
}

