class FindTheOriginalTypedStringI {
    fun possibleStringCount(word: String): Int {
        var ans = 1
        for (i in 1 until word.length) {
            if (word[i] == word[i - 1]) {
                ans++
            }
        }
        return ans    
    }
}
