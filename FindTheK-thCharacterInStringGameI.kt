class FindTheK-thCharacterInStringGameI {
     private fun nextChar(c: Char): Char {
        return if (c == 'z') 'a' else c + 1
    }
    fun kthCharacter(k: Int): Char {
        val word = StringBuilder("a")
        while (word.length < k) {
            val len = word.length
            val nextPart = StringBuilder()
            for (i in 0 until len) {
                nextPart.append(nextChar(word[i]))
            }
            word.append(nextPart)
        }
        return word[k - 1]
    }
}
