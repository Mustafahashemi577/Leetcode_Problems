class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var increase = 1
        var decrease = 1
        var maximum = 1
        for(i in 0 until nums.size-1){
            if(nums[i]<nums[i+1])
                maximum++
            else
                maximum=1
            increase = max(maximum,increase)
        }
        maximum = 1
        for(i in 0 until nums.size-1){
            if(nums[i]>nums[i+1])
                maximum++
            else
                maximum=1
            decrease = max(maximum,decrease)
        }
        return max(increase,decrease)
    }
}
