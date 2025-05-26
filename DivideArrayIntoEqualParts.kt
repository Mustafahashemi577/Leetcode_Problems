class DivideArrayIntoEqualParts {
    fun divideArray(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        for ((_, count) in map) {
            if (count % 2 == 1) {
                return false
            }
        }

        return true
    }
}
