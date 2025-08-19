class NumberOfZero_FilledSubarrays {
    fun zeroFilledSubarray(nums: IntArray): Long {
        var count = 0L
        var streak = 0L
        for(num in nums){
            if(num==0){
                streak++
                count+=streak
            }
            else
                streak=0
        }
        return count
    }
}
