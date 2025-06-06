class SortArrayByIncreasingFrequency {
    fun frequencySort(nums: IntArray): IntArray {
        val count = mutableMapOf<Int, Int>()
        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }
        return nums
            .sortedWith(compareBy({ count[it] }, { -it }))
            .toIntArray()    
    }
}
