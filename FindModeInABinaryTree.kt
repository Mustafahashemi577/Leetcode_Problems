class FindModeInABinaryTree {
    private val map = HashMap<Int, Int>()

    fun findMode(root: TreeNode?): IntArray {
        inorder(root)

        var max = 0
        val list = mutableListOf<Int>()

        for ((key, value) in map) {
            if (value > max) {
                max = value
                list.clear()
                list.add(key)
            } else if (value == max) {
                list.add(key)
            }
        }

        return list.toIntArray()
    }

    private fun inorder(node: TreeNode?) {
        if (node == null) return
        inorder(node.left)
        map[node.`val`] = map.getOrDefault(node.`val`, 0) + 1
        inorder(node.right)
    }
}
