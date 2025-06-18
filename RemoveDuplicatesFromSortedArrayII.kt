class RemoveDuplicatesFromSortedArrayII {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 0
        for(num in nums){
            if(l<2||num!=nums[l-2]){
                nums[l]=num
                l++
            }
        }
        return l   
    }
}
