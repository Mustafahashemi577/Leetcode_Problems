class TwoSum||-InputArrayIsSorted {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1
        while (i < j) {
            val sum = numbers[i] + numbers[j]
            when {
                sum == target -> return intArrayOf(i + 1, j + 1)
                sum > target -> j--
                else -> i++
            }
        }
        return intArrayOf()
    }
}
