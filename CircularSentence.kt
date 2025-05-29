class CircularSentence {
    fun isCircularSentence(sentence: String): Boolean {
        val words = sentence.split(" ")
        for (i in 0 until words.size - 1) {
            if (words[i].last() != words[i + 1].first()) {
                return false
            }
        }
        return words.last().last() == words.first().first()    
    }
}
