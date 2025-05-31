class RedistributeCharactersToMakeAllStringsEqual {
    fun makeEqual(words: Array<String>): Boolean {
        val charCount = mutableMapOf<Char, Int>()
        for (word in words) {
            for (c in word) {
                charCount[c] = charCount.getOrDefault(c, 0) + 1
            }
        }
        for ((_, count) in charCount) {
            if (count % words.size != 0) return false
        }
        return true
    }
}
