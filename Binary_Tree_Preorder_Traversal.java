class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }
    private void preOrder(TreeNode root,List list){
        if(root==null)
        return;
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}