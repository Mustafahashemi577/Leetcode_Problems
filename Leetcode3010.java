class Leetcode3010 {
    public int minimumCost(int[] nums) {
        int min = 51,secondMin=51;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<secondMin){
                if(nums[i]<min){
                    secondMin = min;
                    min = nums[i];
                }
                else
                    secondMin = nums[i];
            }
        }
        return nums[0]+min+secondMin;
    }
}
