class SetMismatch {
    fun findErrorNums(nums: IntArray): IntArray {
        val set = HashSet<Int>()
        val result = IntArray(2)
        for(num in nums){
            if(set.contains(num))
                result[0]=num
            else
                set.add(num)
        }
        for(i in 1..nums.size){
            if(!set.contains(i)){
                result[1]=i
                break
            }
        }
        return result
    }
}
