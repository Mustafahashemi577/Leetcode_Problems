class SpecialArrayI {
    fun isArraySpecial(nums: IntArray): Boolean {
        if(nums.size==1)
            return true
        for(i in 1..nums.size-1){
            if(nums[i]%2==nums[i-1]%2)
                return false
        }
        return true;
    }
}
