class MoveZeros {
    fun moveZeroes(nums: IntArray): Unit {
        var l = 0
        for(r in 0..nums.size-1)
            if(nums[r]!=0)
                nums[l++]=nums[r]

        while(l<nums.size)
            nums[l++]=0
    }
}
