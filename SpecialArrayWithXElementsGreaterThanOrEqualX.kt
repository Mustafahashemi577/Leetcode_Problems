class SpecialArrayWithXElementsGreaterThanOrEqualX {
    fun specialArray(nums: IntArray): Int {
        for(i in 1..nums.size){
            var count = 0
            for(num in nums){
                if(num>=i)
                    count++
            }
            if(count == i)
                return i;
        }
        return -1
    }
}
