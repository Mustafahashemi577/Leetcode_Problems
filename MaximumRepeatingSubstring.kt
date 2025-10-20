class MaximumRepeatingSubstring {
    fun maxRepeating(sequence: String, word: String): Int {
        val sb = StringBuilder(word)
        var k = 0

        while (sequence.contains(sb.toString())) {
            k++
            sb.append(word)
        }

        return k
    }
}

