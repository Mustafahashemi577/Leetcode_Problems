class MaximumNumberOfVowelsInASubstringOfGivenLength {
    fun maxVowels(s: String, k: Int): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var l = 0
        var cnt = 0
        var res = 0

        for (r in s.indices) {
            if (s[r] in vowels) cnt++
            if (r - l + 1 > k) {
                if (s[l] in vowels) cnt--
                l++
            }
            res = maxOf(res, cnt)
        }
        return res
    }
}
