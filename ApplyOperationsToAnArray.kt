class ApplyOperationsToAnArray {
    fun applyOperations(nums: IntArray): IntArray {
        for(i in 0 until nums.size-1)
            if(nums[i]==nums[i+1]){
                nums[i]*=2
                nums[i+1]=0
            }
        
        var l = 0
        for(r in 0..nums.size-1)
            if(nums[r]!=0)
                nums[l++]=nums[r]

        while(l<nums.size)
            nums[l++]=0
        return nums
    }
}
