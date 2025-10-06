class LongestContinuousIncreasingSubsequence {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var ans = 1
        var cur = 1
        for(i in 0 until nums.size-1){
            if(nums[i]<nums[i+1]){
                cur++;
            }
            else{
                ans = max(cur,ans)
                cur=1
            }
        }
        return max(ans,cur)
    }
}
