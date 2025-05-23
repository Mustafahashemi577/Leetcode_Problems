class WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if (pattern.length != words.size) return false

        val charToWord = mutableMapOf<Char, String>()
        val wordToChar = mutableMapOf<String, Char>()

        for (i in pattern.indices) {
            val c = pattern[i]
            val word = words[i]

            if (charToWord[c] == null && wordToChar[word] == null) {
                charToWord[c] = word
                wordToChar[word] = c
            } else {
                if (charToWord[c] != word || wordToChar[word] != c) {
                    return false
                }
            }
        }
        return true
    }
}
