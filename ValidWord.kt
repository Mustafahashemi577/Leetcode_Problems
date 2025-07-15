class ValidWord {
    fun isValid(word: String?): Boolean {
        if (word == null || word.length < 3) {
            return false
        }

        var hasVowel = false
        var hasConsonant = false

        for (ch in word) {
            if (!ch.isLetterOrDigit()) {
                return false // Invalid character
            }

            if (isVowel(ch)) {
                hasVowel = true
            } else if (ch.isLetter()) {
                hasConsonant = true
            }
        }

        return hasVowel && hasConsonant
    }

    private fun isVowel(ch: Char): Boolean {
        return ch.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
}

