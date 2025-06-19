class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val steps = k % n
        val b = nums.copyOf()

        for (i in n - 1 downTo steps) {
            nums[i] = nums[i - steps]
        }

        for (i in 0 until steps) {
            nums[i] = b[i + (n - steps)]
        }
    }
}
