class BinaryTreeZigzagLevelOrderTraversal {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        for (i in 0 until height(root)) {
            val list = mutableListOf<Int>()
            getNodesAt(root, i, list)
            if (i % 2 == 1) {
                list.reverse()
            }
            res.add(list)
        }
        return res
    }

    private fun height(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + maxOf(height(root.left), height(root.right))
    }

    private fun getNodesAt(node: TreeNode?, distance: Int, list: MutableList<Int>) {
        if (node == null) return
        if (distance == 0) {
            list.add(node.`val`)
            return
        }
        getNodesAt(node.left, distance - 1, list)
        getNodesAt(node.right, distance - 1, list)
    }
}
