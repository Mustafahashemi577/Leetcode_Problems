class ArrayWithElementsNotEqualToAverageOfNeighbors {
    fun rearrangeArray(nums: IntArray): IntArray {
        nums.sort()
        var i = 1
        while(i<nums.size){
            val temp = nums[i]
            nums[i]=nums[i-1]
            nums[i-1]=temp
            i+=2
        }
        return nums
    }
}
