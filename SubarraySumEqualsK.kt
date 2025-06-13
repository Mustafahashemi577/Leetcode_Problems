class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        val pref = IntArray(nums.size + 1)        
        for (i in 1 until pref.size) {
            pref[i] = pref[i - 1] + nums[i - 1]
            if (pref[i] == k) count++
        }
        for (i in 1 until pref.size) {
            for (j in i + 1 until pref.size) {
                if (pref[j] - pref[i] == k) count++
            }
        }
        return count
    }
}
