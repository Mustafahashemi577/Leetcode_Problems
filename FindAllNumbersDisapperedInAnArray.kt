class FindAllNumbersDisapperedInAnArray{
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val list = mutableListOf<Int>()
        val set = nums.toHashSet()
        for (i in 1..nums.size) {
            if (i !in set) {
                list.add(i)
            }
        }
        return list
    }
}
