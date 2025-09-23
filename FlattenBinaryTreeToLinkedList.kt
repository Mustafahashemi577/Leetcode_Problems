class FlattenBinaryTreeToLinkedList {
    fun flatten(root: TreeNode?) {
        var current = root
        while (current != null) {
            if (current.left != null) {
                var temp = current.left
                while (temp?.right != null) {
                    temp = temp.right
                }
                temp?.right = current.right
                current.right = current.left
                current.left = null
            }
            current = current.right
        }
    }
}

