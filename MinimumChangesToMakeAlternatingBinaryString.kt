class MinimumChangesToMakeAlternatingBinaryString {
    fun minOperations(s: String): Int {
        var count = 0
        for (i in s.indices) {
            if (i % 2 == 0) {
                if (s[i] == '0') {
                    count++
                }
            } else {
                if (s[i] == '1') {
                    count++
                }
            }
        }
        return minOf(count, s.length - count)
    }
}
