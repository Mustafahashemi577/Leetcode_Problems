class Maximum_Depth_Of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root == null )
        return 0;
        return(1+Math.max(maxDepth(root.left),maxDepth(root.right)));
    }
}