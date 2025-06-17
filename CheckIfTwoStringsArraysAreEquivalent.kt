class CheckIfTwoStringsArraysAreEquivalent {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
        val sb1 = StringBuilder()
        val sb2 = StringBuilder()
        for(s in word1)
            sb1.append(s)
        for(s in word2)
            sb2.append(s)
        return sb1.toString() == sb2.toString()
    }
}
