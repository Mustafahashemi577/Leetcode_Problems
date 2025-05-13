class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        val str = s.trim().split(" ")
        return str.last().length
    }
}

