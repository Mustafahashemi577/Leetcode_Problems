class MinimumIndexOfAValidSplit {
    fun minimumIndex(nums: List<Int>): Int {
        val mapLeft = mutableMapOf<Int, Int>()
        val mapRight = mutableMapOf<Int, Int>()
        val n = nums.size

        for (num in nums) {
            mapRight[num] = mapRight.getOrDefault(num, 0) + 1
        }

        for (i in nums.indices) {
            val num = nums[i]
            mapLeft[num] = mapLeft.getOrDefault(num, 0) + 1
            mapRight[num] = mapRight[num]!! - 1

            val leftLen = i + 1
            val rightLen = n - i - 1

            if (2 * mapLeft[num]!! > leftLen && 2 * mapRight.getOrDefault(num, 0) > rightLen) {
                return i
            }
        }

        return -1 

    }
}
