class BinaryTreePaths {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        val answer = mutableListOf<String>()
        if (root != null) searchBT(root, "", answer)
        return answer
    }

    private fun searchBT(root: TreeNode?, path: String, answer: MutableList<String>) {
        if (root == null) return
        if (root.left == null && root.right == null) {
            answer.add(path + root.`val`)
        }
        if (root.left != null) {
            searchBT(root.left, path + root.`val` + "->", answer)
        }
        if (root.right != null) {
            searchBT(root.right, path + root.`val` + "->", answer)
        }
    }
}
