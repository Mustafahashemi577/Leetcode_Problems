class Count_Complete_Tree_Nodes {
    int count=0;
    public int countNodes(TreeNode root) {
        counter(root);
        return count;
    }
    private int counter(TreeNode root){
        if(root==null)
        return count;
        count++;
        counter(root.right);
        counter(root.left);
        return count;
    }
}