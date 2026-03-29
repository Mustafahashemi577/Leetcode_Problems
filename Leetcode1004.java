class Leetcode1004{
    public int longestOnes(int[] nums, int k) {
        int maxL=0,l=0,r=0,zero=0;
        while(r<nums.length){
            if(nums[r]==0)
                zero++;
            if(zero>k){
                if(nums[l]==0)
                    zero--;
                l++;
            }
            if(zero<=k)
                maxL = Math.max(maxL,r-l+1);
            r++;
        }
        return maxL;
    }
}
