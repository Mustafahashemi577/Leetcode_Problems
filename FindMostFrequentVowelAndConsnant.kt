class FindMostFrequentVowelAndConsnant {
    fun maxFreqSum(s: String): Int {
        val vowel = mutableMapOf<Char, Int>()
        val consonant = mutableMapOf<Char, Int>()
        var vowelMax = 0
        var consonantMax = 0

        for (c in s) {
            if (c in listOf('a', 'e', 'i', 'o', 'u')) {
                vowel[c] = vowel.getOrDefault(c, 0) + 1
            } else {
                consonant[c] = consonant.getOrDefault(c, 0) + 1
            }
        }

        for ((_, value) in vowel) {
            vowelMax = maxOf(vowelMax, value)
        }

        for ((_, value) in consonant) {
            consonantMax = maxOf(consonantMax, value)
        }

        return consonantMax + vowelMax
    }
}
