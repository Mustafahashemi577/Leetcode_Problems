class LargestSubstringBetweenTwoEqualCharacter {
    fun maxLengthBetweenEqualCharacters(s: String): Int {
        if (s.length == 1)
            return -1
        var max = -1
        for (i in 0 until s.length - 1) {
            for (j in i + 1 until s.length) {
                if (s[i] == s[j]) {
                    max = maxOf(max, (j - i - 1))
                }
            }
        }
        return max
    }
}
