class MajorityElementII {
    fun majorityElement(nums: IntArray): List<Int> {
        val list = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        val n = nums.size
        for ((key, value) in map) {
            if (value > n / 3.0) {
                list.add(key)
            }
        }
        return list
    }
}
