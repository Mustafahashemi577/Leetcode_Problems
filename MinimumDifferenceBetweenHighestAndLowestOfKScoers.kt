class MinimumDifferenceBetweenHighestAndLowestOfKScoers {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var l = 0
        var r = k-1
        var result = Integer.MAX_VALUE
        while(r<nums.size){
            result = min(result,nums[r]-nums[l])
            r++
            l++
        }
        return result
    }
}
