class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
       invers(root);
       return root;
    }
    private void invers(TreeNode root){
        if(root==null)
        return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        invers(root.right);
        invers(root.left);
    }
}