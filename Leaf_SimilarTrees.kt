class Leaf_SimilarTrees {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        dfs(root1, list1)
        dfs(root2, list2)
        return list1 == list2
    }

    private fun dfs(root: TreeNode?, leaf: MutableList<Int>) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            leaf.add(root.`val`)
            return
        }
        dfs(root.left, leaf)
        dfs(root.right, leaf)
    }
}

