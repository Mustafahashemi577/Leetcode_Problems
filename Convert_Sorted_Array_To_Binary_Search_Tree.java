
class Convert_Sorted_Array_To_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        return nodeConstructor(nums, l, r);        
    }
    public TreeNode nodeConstructor(int [] nums, int l,int r){
        if(l>r)
        return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left= nodeConstructor(nums,l,mid-1);
        root.right=nodeConstructor(nums,mid+1,r);

        return root;
    }
}