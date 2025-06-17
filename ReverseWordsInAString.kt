class ReverseWordsInAString {
    fun reverseWords(s: String): String {
        var result = ""
        for (word in s.split(" ")) {
            result += word.reversed() + " "
        }
        return result.dropLast(1)
    }
}
