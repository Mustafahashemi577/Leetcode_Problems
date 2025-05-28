class CountTheNumberOfConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
          var allowedMask = 0
        for (c in allowed) {
            allowedMask = allowedMask or (1 shl (c - 'a'))
        }

        var count = 0
        for (word in words) {
            var wordMask = 0
            for (c in word) {
                wordMask = wordMask or (1 shl (c - 'a'))
            }
            if ((wordMask or allowedMask) == allowedMask) {
                count++
            }
        }

        return count    
    }
}
