class Leetcode3818 {
    public int minimumPrefixLength(int[] nums) {
        int count = 0;
        if(nums.length>=2 && nums[nums.length-1]<=nums[nums.length-2])
            return nums.length-1;
        var index = -1;
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]<=nums[i-1]){
                index = i-1;
                break;
            }
        }
        if(index!=-1)
            count = index+1;
        return count;
    }
}
