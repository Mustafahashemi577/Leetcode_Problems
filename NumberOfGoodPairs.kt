class NumberOfGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0;
        for(i in 0..nums.size-1)
            for(j in i+1..nums.size-1)
                if(nums[i]==nums[j])
                    count++
        
        return count
    }
}
