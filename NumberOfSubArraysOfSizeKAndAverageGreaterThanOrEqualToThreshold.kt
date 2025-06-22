class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var sum = 0
        var count = 0
        if (k == 1) {
            for (a in arr) {
                if (a >= threshold) {
                    count++
                }
            }
            return count
        }
        for (i in 0 until k) {
            sum += arr[i]
        }
        if (sum / k >= threshold) {
            count++
        }
        for (i in 1..arr.size - k) {
            sum -= arr[i - 1]
            sum += arr[i + k - 1]
            if (sum / k >= threshold) {
                count++
            }
        }
        return count
    }
}
