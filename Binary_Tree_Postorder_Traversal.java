class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
     List <Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    private void postOrder(TreeNode root, List list){
        if(root==null)
        return;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
}