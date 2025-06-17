class FindFirstPalindromicStringInTheArray {
    fun firstPalindrome(words: Array<String>): String {
        for(word in words){
            val temp = word.reversed()
            if(temp == word)
                return word
        }
        return ""
    }
}
