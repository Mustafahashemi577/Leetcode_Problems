class LongestPalindrome {
    fun longestPalindrome(s: String): Int {
        val map = mutableMapOf<Char, Int>()
        var result = 0
        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        if (map.size == 1) return s.length
        var odd = false
        for (freq in map.values) {
            if (freq % 2 != 0 && !odd) {
                result += freq
                odd = true
            } else if (freq % 2 != 0 && odd) {
                result += freq - 1
            } else {
                result += freq
            }
        }
        return result
      
    }
}
