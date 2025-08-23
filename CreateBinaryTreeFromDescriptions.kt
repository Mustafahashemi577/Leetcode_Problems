class CreateBinaryTreeFromDescriptions {
    fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
        val mp = mutableMapOf<Int, TreeNode>()
        val hasParent = mutableSetOf<Int>()
        for (desc in descriptions) {
            if (!mp.containsKey(desc[0])) {
                mp[desc[0]] = TreeNode(desc[0])
            }
            if (!mp.containsKey(desc[1])) {
                mp[desc[1]] = TreeNode(desc[1])
            }
            hasParent.add(desc[1])
        }
        var root: TreeNode? = null
        for (desc in descriptions) {
            if (desc[2] == 1) { // left
                mp[desc[0]]?.left = mp[desc[1]]
            } else { // right
                mp[desc[0]]?.right = mp[desc[1]]
            }
            if (!hasParent.contains(desc[0])) {
                root = mp[desc[0]]
            }
        }
        return root
    }
}
