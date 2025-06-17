class SortArrayByParity {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var i = 0
        var j = nums.size-1
        for(num in nums){
            if(num%2==0)
                result[i++]=num
            else
                result[j--]=num
        }
        return result
    }
}
