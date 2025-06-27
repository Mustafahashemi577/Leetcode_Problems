class LongestRepeatingCharacterReplacement {
    fun characterReplacement(s: String, k: Int): Int {
        val count = mutableMapOf<Char, Int>()
        var res = 0
        var l = 0
        var maxf = 0
        for (r in s.indices) {
            val char = s[r]
            count[char] = count.getOrDefault(char, 0) + 1
            maxf = maxOf(maxf, count[char]!!)
            while ((r - l + 1) - maxf > k) {
                val leftChar = s[l]
                count[leftChar] = count[leftChar]!! - 1
                l++
            }
            res = maxOf(res, r - l + 1)
        }
        return res
    }
}
